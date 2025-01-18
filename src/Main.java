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
import iterator.DinerMenu;
import iterator.PancakeHouseMenu;
import iterator.Waitress;

public class Main {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}
}