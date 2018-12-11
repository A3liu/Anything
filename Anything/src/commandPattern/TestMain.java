package commandPattern;

import commandPattern.Entity.GarageDoor;
import commandPattern.Entity.Light;
import commandPattern.command.GarageDoorOpenCommand;

public class TestMain {
    public static void main(String[] args) {
        SimpalRemoteControl controler = new SimpalRemoteControl();
        Light light = new Light();
        GarageDoor door = new GarageDoor();
//        Command command = new LightOnCommand(light);
        Command command = null;
        command = new GarageDoorOpenCommand(door);


        controler.setCommand(command);

        controler.buttonWasPressed();
    }
}
