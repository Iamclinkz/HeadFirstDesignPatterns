package ch6_command.command.impl;

import ch6_command.command.Command;
import ch6_command.receiver.Door;

public class DoorOpenCmd implements Command {
    Door door;

    public DoorOpenCmd(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
