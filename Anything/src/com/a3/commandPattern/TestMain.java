package com.a3.commandPattern;

import com.a3.commandPattern.Entity.GarageDoor;
import com.a3.commandPattern.Entity.Light;
import com.a3.commandPattern.command.GarageDoorOpenCommand;

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
