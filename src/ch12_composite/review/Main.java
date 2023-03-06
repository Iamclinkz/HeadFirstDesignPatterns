package ch12_composite.review;

import ch12_composite.review.flock.Flock;
import ch12_composite.review.observer.quack_observer.Quackologist;
import ch12_composite.review.quackable_factory.QuackableAbstractFactory;
import ch12_composite.review.quackable_factory.impl.QuackableWithCounterFactory;
import ch12_composite.review.wrapper.QuackableCounterWrapper;

public class Main {
    public static void main(String[] args) {
        new Main().test();
    }

    public void test()
    {
        QuackableAbstractFactory factory = new QuackableWithCounterFactory();
        Flock totalDuckFlock = new Flock();
        totalDuckFlock.addChild(factory.createDecoyDuck());
        totalDuckFlock.addChild(factory.createMallardDuck());
        totalDuckFlock.addChild(factory.createDuckCall());
        totalDuckFlock.addChild(factory.createRubberDuck());

        Flock redHeadFlock = new Flock();
        redHeadFlock.addChild(factory.createRedHeadDuck());
        redHeadFlock.addChild(factory.createRedHeadDuck());
        redHeadFlock.addChild(factory.createRedHeadDuck());
        redHeadFlock.addChild(factory.createRedHeadDuck());
        totalDuckFlock.addChild(redHeadFlock);
        redHeadFlock.addObserver(new Quackologist());

        totalDuckFlock.quack();

        System.out.println("total quack counter: "+ QuackableCounterWrapper.getQuackCounter());
    }
}
