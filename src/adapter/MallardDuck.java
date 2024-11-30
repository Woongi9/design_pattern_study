package adapter;

public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("꽥");
	}

	@Override
	public void fly() {
		System.out.println("날 수 있어요");
	}
}
