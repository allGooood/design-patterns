package org.example.command.receiver.tv;

import org.example.command.Command;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
