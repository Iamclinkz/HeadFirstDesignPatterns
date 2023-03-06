package ch12_composite.review.quackable;

import ch12_composite.review.observer.quack_subject.QuackSubject;

public interface Quackable extends QuackSubject {
    public void quack();
}
