package ch12_composite.beat_bar.controller;
  
public interface Controller {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}
