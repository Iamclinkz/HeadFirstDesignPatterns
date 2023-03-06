package ch12_composite.review.quackable.impl;

import ch12_composite.review.observer.quack_observer.QuackObserver;
import ch12_composite.review.observer.quack_subject.QuackSubjectHelper;
import ch12_composite.review.quackable.Quackable;

public class MallardDuck implements Quackable {
	QuackSubjectHelper subjectHelper;

	public MallardDuck() {
		this.subjectHelper = new QuackSubjectHelper(this);
	}
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void addObserver(QuackObserver observer) {
		subjectHelper.addObserver(observer);
	}

	@Override
	public void notifyObservers() {
		subjectHelper.notifyObservers();
	}
}
