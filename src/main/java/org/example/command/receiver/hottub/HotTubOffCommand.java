package org.example.command.receiver.hottub;

import org.example.command.Command;

public class HotTubOffCommand implements Command {
    HotTub hotTub;

    public HotTubOffCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
