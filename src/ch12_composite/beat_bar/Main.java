package ch12_composite.beat_bar;

import ch12_composite.beat_bar.controller.Controller;
import ch12_composite.beat_bar.controller.impl.ControllerImpl;
import ch12_composite.beat_bar.model.BeatModel;
import ch12_composite.beat_bar.model.impl.MusicBeat;

public class Main {
    public static void main(String[] args) {
        BeatModel beatModel = new MusicBeat();
        Controller controller = new ControllerImpl(beatModel);
    }
}
