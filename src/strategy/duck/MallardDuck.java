package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;

public class MallardDuck extends Duck {		// quack() X, fly() O

	public MallardDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("mallard duck 입니다");
		introduce();
	}
}
