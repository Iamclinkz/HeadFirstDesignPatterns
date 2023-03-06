package ch12_composite.beat_bar.model;

import ch12_composite.beat_bar.observer.BPMObserver;
import ch12_composite.beat_bar.observer.BeatObserver;

public interface BeatModel {
	void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
