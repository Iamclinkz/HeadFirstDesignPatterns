package ch6_command.command.impl;

import ch6_command.command.Command;
import ch6_command.receiver.AirConditioner;

public class AirConditionerOpenCmd implements Command {
    AirConditioner airConditioner;

    public AirConditionerOpenCmd(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.open();
    }

    @Override
    public void undo() {
        airConditioner.close();
    }
}
