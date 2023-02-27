package ch6_command.command.impl;

import ch6_command.command.Command;
import ch6_command.receiver.Door;

public class DoorCloseCmd implements Command {
    Door door;

    public DoorCloseCmd(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }
}
