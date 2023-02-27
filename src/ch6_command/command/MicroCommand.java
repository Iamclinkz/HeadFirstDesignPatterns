package ch6_command.command;

//宏命令，即命令的组合。相当于是对命令序列的封装。可以装填任意多的命令，
//然后批量的执行 / 撤销
public class MicroCommand implements Command{
    Command[] commands;

    public MicroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        if(commands == null)
            return;
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        if(commands == null)
            return;
        for (Command command : commands) {
            command.undo();
        }
    }
}
