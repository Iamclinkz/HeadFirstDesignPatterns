package ch12_composite.review.wrapper;

import ch12_composite.review.observer.quack_observer.QuackObserver;
import ch12_composite.review.quackable.Quackable;

public class QuackableCounterWrapper implements Quackable {
    Quackable quackable;

    static int quackCounter = 0;

    public QuackableCounterWrapper(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackCounter++;

        quackable.quack();
    }

    //wrapper如果希望给接口中的某个方法拓展功能，那么其他的方法只需要原封不动的传给wrapped就行了
    @Override
    public void addObserver(QuackObserver observer) {
        quackable.addObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }

    public static int getQuackCounter()
    {
        return quackCounter;
    }
}
