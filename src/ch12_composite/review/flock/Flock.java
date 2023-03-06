package ch12_composite.review.flock;

import ch12_composite.review.observer.quack_observer.QuackObserver;
import ch12_composite.review.quackable.Quackable;

import java.util.LinkedList;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> quackables = new LinkedList<>();

    public void addChild(Quackable quackable)
    {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        for(Quackable quackable : quackables)
        {
            quackable.quack();
        }
    }

    @Override
    public void addObserver(QuackObserver observer) {
        for(Quackable quackable : quackables)
        {
            quackable.addObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        quackables.forEach(quackable -> quackable.notifyObservers());
    }
}
