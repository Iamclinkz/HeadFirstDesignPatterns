package ch12_composite.beat_bar.model.impl;

import ch12_composite.beat_bar.model.BeatModel;
import ch12_composite.beat_bar.observer.BPMObserver;
import ch12_composite.beat_bar.observer.BeatObserver;

import java.util.LinkedList;
import java.util.List;

public class MusicBeat implements BeatModel {
    private int bpm;

    private final int MaxBpm = 120;

    //原书中变量竟然没有做互斥访问。。感觉有点不应该
    private Boolean start;
    final Object startLock = new Object();

    private final List<BPMObserver> bpmObservers = new LinkedList<>();
    private final List<BeatObserver> beatObservers = new LinkedList<>();

    private final Thread thread = new Thread(()->{
        try{
            while(true){
                //如果当前状态是start，那么每隔固定时间，通知所有的beatObserver更新节拍
                Thread.sleep(60000 / bpm);
                synchronized (startLock){
                    if(!start){
                        return;
                    }
                }
                beatObservers.forEach(BeatObserver::updateBeat);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    });

    @Override
    public void initialize() {
        setBPM(60);
        start = false;
    }

    @Override
    public void on() {
        synchronized (startLock){
            if(start)
                return;
            thread.start();
            start = true;
        }
    }

    @Override
    public void off() {
        synchronized (startLock){
            if(!start)
                return;
            start = false;
        }
    }

    //这里model中具体某个变量的set函数应该由model自己在set的过程中，
    //判断bpm有无越界。不可以直接相信来自controller的变化
    @Override
    public void setBPM(int bpm) {
        if(bpm > MaxBpm)
            bpm = MaxBpm;
        if(bpm < 0)
            bpm = 0;
        this.bpm = bpm;
        bpmObservers.forEach(BPMObserver::updateBPM);
    }

    @Override
    public int getBPM() {
        return this.bpm;
    }

    //mvc框架的精髓就在于，model层同时也是观察者模式中的Subject对象
    //view/controller层同时也可以是Subject对象的observer对象
    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        bpmObservers.remove(o);
    }
}
