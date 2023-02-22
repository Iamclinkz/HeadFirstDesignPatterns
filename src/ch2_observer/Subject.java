package ch2_observer;

public interface Subject {
    void registerObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
