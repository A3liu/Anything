package com.a3.commandPattern;

public class SimpalRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
