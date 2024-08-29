package org.example.command.receiver.tv;

import org.example.command.Command;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
