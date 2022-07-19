package com.example.corepatterns.patterns.command;

public class RemoteControlInvoker {

    private Command command;

    public void pressButton(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
