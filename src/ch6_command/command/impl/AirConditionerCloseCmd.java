package ch6_command.command.impl;

import ch6_command.command.Command;
import ch6_command.receiver.AirConditioner;

public class AirConditionerCloseCmd implements Command {
    AirConditioner airConditioner;

    public AirConditionerCloseCmd(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.close();
    }

    @Override
    public void undo() {
        airConditioner.open();
    }
}
