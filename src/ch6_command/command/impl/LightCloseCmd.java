package ch6_command.command.impl;

import ch6_command.command.Command;
import ch6_command.receiver.Light;

public class LightCloseCmd implements Command {
    Light light;

    public LightCloseCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
