package ch12_composite.review.observer.quack_observer;

import ch12_composite.review.quackable.Quackable;

//鸭子叫的观察者，实现这个接口，并且注册，可以实现每当鸭子叫的时候，都应该被通知
public interface QuackObserver {
    public void onQuack(Quackable quackable);
}
