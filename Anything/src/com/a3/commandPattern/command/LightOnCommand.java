package com.a3.commandPattern.command;

import com.a3.commandPattern.Command;
import com.a3.commandPattern.Entity.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
