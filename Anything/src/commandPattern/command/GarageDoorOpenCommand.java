package commandPattern.command;

import commandPattern.Command;
import commandPattern.Entity.GarageDoor;

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
