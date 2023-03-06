package ch12_composite.review.observer.quack_subject;

import ch12_composite.review.observer.quack_observer.QuackObserver;

public interface QuackSubject {
    public void addObserver(QuackObserver observer);
    public void notifyObservers();
}
