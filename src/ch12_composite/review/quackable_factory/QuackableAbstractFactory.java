package ch12_composite.review.quackable_factory;

import ch12_composite.review.quackable.Quackable;

public interface QuackableAbstractFactory {
    Quackable
    createDecoyDuck();
    Quackable createDuckCall();
    Quackable createMallardDuck();
    Quackable createRedHeadDuck();
    Quackable createRubberDuck();
}
