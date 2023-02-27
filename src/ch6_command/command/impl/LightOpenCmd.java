package ch6_command.command.impl;

import ch6_command.command.Command;
import ch6_command.receiver.Light;

public class LightOpenCmd implements Command {
    Light light;

    public LightOpenCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
