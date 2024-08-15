package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Squeak;

public class RubberDuck extends Duck {	// quack() O (삐삐 소리 내야함), fly() X

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("rubber duck 입니다");
		introduce();
	}
}
