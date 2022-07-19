package com.example.corepatterns.patterns.command;

public class OnCommand implements Command{

    TelevisionReceiver receiver;

    public OnCommand(TelevisionReceiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
     receiver.on();
    }
}
