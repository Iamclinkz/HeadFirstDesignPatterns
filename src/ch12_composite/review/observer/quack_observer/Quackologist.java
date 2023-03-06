package ch12_composite.review.observer.quack_observer;

import ch12_composite.review.observer.quack_observer.QuackObserver;
import ch12_composite.review.quackable.Quackable;

//每当有duck叫的时候，都应该通知这些鸭叫学家
public class Quackologist implements QuackObserver {

    @Override
    public void onQuack(Quackable quackable) {
        System.out.println("Quackologist heard "+quackable.getClass()+" quack");
    }
}
