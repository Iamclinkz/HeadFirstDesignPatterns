package ch12_composite.beat_bar.model.impl;

import ch12_composite.beat_bar.model.BeatModel;
import ch12_composite.beat_bar.observer.BPMObserver;
import ch12_composite.beat_bar.observer.BeatObserver;

public class HeartBeatAdapter implements BeatModel {
    HeartBeat heartBeat;

    public HeartBeatAdapter(HeartBeat heartBeat) {
        this.heartBeat = heartBeat;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return heartBeat.getBpm();
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }
}
