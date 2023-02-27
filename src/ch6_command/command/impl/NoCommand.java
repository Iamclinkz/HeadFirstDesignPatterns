package ch6_command.command.impl;

import ch6_command.command.Command;

public class NoCommand implements Command {
    //不做任何事情的Command，如果当前不需要执行任何command，可以使用NoCommand填充可能为空的Command槽，
    //这样就可以避免每次判空Command槽。
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
