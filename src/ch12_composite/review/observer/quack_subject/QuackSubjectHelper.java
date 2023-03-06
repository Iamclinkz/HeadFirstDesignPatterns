package ch12_composite.review.observer.quack_subject;

import ch12_composite.review.observer.quack_observer.QuackObserver;
import ch12_composite.review.quackable.Quackable;

import java.util.LinkedList;
import java.util.List;

public class QuackSubjectHelper implements QuackSubject {
    Quackable quackable;

    private List<QuackObserver> observers = new LinkedList<>();

    public QuackSubjectHelper(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void addObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.onQuack(quackable));
    }
}
