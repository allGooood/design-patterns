package org.example.command.receiver.hottub;

import org.example.command.Command;

public class HotTubOnCommand implements Command {
    HotTub hotTub;

    public HotTubOnCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
