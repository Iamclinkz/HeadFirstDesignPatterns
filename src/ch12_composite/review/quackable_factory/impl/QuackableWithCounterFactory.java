package ch12_composite.review.quackable_factory.impl;

import ch12_composite.review.wrapper.QuackableCounterWrapper;
import ch12_composite.review.quackable.Quackable;
import ch12_composite.review.quackable.impl.*;
import ch12_composite.review.quackable_factory.QuackableAbstractFactory;

public class QuackableWithCounterFactory implements QuackableAbstractFactory {
    @Override
    public Quackable createDecoyDuck() {
        return new QuackableCounterWrapper(new DecoyDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackableCounterWrapper(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackableCounterWrapper(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackableCounterWrapper(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackableCounterWrapper(new RubberDuck());
    }
}
