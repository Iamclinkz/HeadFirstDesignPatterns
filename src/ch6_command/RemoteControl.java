package ch6_command;

import ch6_command.command.Command;
import ch6_command.command.impl.NoCommand;

public class RemoteControl {
    Command[] onCommands = new Command[8];
    Command[] offCommands = new Command[8];

    //最后一条执行的command
    Command lastCommand;

    Command undo;

    public RemoteControl()
    {
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
        }

        for (int i = 0; i < offCommands.length; i++) {
            offCommands[i] = new NoCommand();
        }
        lastCommand = new NoCommand();
        undo = new NoCommand();
    }

    public void setCommand(int idx, Command onCmd, Command offCmd)
    {
        onCommands[idx] = onCmd;
        offCommands[idx] = offCmd;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
        undo = offCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
        undo = onCommands[slot];
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuff.append("[last] ").append(lastCommand.getClass().getName()).append("\n");
        stringBuff.append("[undo] ").append(undo.getClass().getName()).append("\n");
        return stringBuff.toString();
    }
}
