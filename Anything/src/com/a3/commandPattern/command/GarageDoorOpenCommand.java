package com.a3.commandPattern.command;

import com.a3.commandPattern.Command;
import com.a3.commandPattern.Entity.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor door = null;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }


    @Override
    public void execute() {
        door.GarageDoorOpen();
    }
}
