package ch12_composite.beat_bar.controller.impl;

import ch12_composite.beat_bar.controller.Controller;
import ch12_composite.beat_bar.model.BeatModel;
import ch12_composite.beat_bar.observer.BPMObserver;
import ch12_composite.beat_bar.observer.BeatObserver;
import ch12_composite.beat_bar.view.DJView;

public class ControllerImpl implements Controller {
    BeatModel model;
    DJView view;

    public ControllerImpl(BeatModel model) {
        //在初始化的过程中，根据传入的model，构建view
        //因为Model传入的是接口，所以controller并不面向具体的Model编程
        this.model = model;
        view = new DJView(this,model);
        model.registerObserver((BeatObserver) view);
        model.registerObserver((BPMObserver) view);
        model.initialize();
        view.createView();
        view.createControls();
    }

    @Override
    public void start() {
        model.on();
    }

    @Override
    public void stop() {
        model.off();
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
