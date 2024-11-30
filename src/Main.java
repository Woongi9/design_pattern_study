import command.GarageDoor;
import command.GarageDoorCloseCommand;
import command.GarageDoorOpenCommand;
import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;
import command.RemoteControl;

public class Main {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		LightOnCommand onLightOnCommand = new LightOnCommand(light);
		LightOffCommand offLightOnCommand = new LightOffCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand onGarageDoor = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand offGarageDoor = new GarageDoorCloseCommand(garageDoor);

		remoteControl.setCommand(1, onLightOnCommand, offLightOnCommand);
		remoteControl.setCommand(4, onGarageDoor, offGarageDoor);

		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(1);
		remoteControl.offButtonWasPushed(4);
	}
}