package org.patterns.command;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor door){
        this.garageDoor = door;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
