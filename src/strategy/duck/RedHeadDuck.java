package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Quack;

public class RedHeadDuck extends Duck {	// quack() O, fly() X

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("red head duck 입니다.");
		introduce();
	}
}
