package ch12_composite.review.quackable_factory.impl;

import ch12_composite.review.observer.quack_subject.QuackSubjectHelper;
import ch12_composite.review.quackable.Quackable;
import ch12_composite.review.quackable.impl.*;
import ch12_composite.review.quackable_factory.QuackableAbstractFactory;

public class QuackableFactory implements QuackableAbstractFactory {
    @Override
    public Quackable createDecoyDuck() {
        return new DecoyDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
