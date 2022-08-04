package com.example.corepatterns.patterns.behavioural.command;

public class OffCommand implements Command{

    TelevisionReceiver receiver;

    public OffCommand(TelevisionReceiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void execute() {
     receiver.off();
    }
}
