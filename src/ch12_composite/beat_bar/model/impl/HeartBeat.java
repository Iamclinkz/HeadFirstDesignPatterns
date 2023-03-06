package ch12_composite.beat_bar.model.impl;

import ch12_composite.beat_bar.observer.BPMObserver;
import ch12_composite.beat_bar.observer.BeatObserver;

import java.util.LinkedList;
import java.util.List;

public class HeartBeat {
    private int bpm;

    public HeartBeat(int bpm) {
        this.bpm = bpm;
    }

    private final List<BPMObserver> bpmObservers = new LinkedList<>();
    private final List<BeatObserver> beatObservers = new LinkedList<>();

    //只有这个方法有用。。
    public int getBpm()
    {
        return bpm;
    }

    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    public void removeObserver(BPMObserver o) {
        bpmObservers.remove(o);
    }
}
