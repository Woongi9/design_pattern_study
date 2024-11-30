import adapter.Duck;
import adapter.MallardDuck;
import adapter.Turkey;
import adapter.TurkeyAdapter;
import adapter.WildTurkey;
import command.GarageDoor;
import command.GarageDoorCloseCommand;
import command.GarageDoorOpenCommand;
import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;
import command.RemoteControl;

public class Main {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("------칠면조------");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		System.out.println();
		System.out.println("------오리------");
		mallardDuck.quack();
		mallardDuck.fly();
	}
}