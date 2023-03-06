package ch12_composite.review.goose;

import ch12_composite.review.observer.quack_observer.QuackObserver;
import ch12_composite.review.observer.quack_subject.QuackSubjectHelper;
import ch12_composite.review.quackable.Quackable;

//为了实现让鹅和鸭子能够统一管理的接口
public class GooseAdapter implements Quackable {
    Goose goose;
    QuackSubjectHelper helper;

    public GooseAdapter(Goose goose, QuackSubjectHelper helper) {
        this.goose = goose;
        this.helper = helper;
    }

    @Override
    public void quack() {
        goose.Honk();
        notifyObservers();
    }

    @Override
    public void addObserver(QuackObserver observer) {
        helper.addObserver(observer);
    }

    @Override
    public void notifyObservers() {
        helper.notifyObservers();
    }
}
