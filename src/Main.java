import strategy.duck.MallardDuck;
import strategy.duck.RedHeadDuck;
import strategy.duck.RubberDuck;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		System.out.println();

		RedHeadDuck redHeadDuck = new RedHeadDuck();
		redHeadDuck.display();
		System.out.println();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		System.out.println();
	}
}