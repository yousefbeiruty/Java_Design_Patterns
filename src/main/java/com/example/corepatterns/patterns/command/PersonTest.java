package com.example.corepatterns.patterns.command;

public class PersonTest {

    public static void main(String[] args) {
        TelevisionReceiver receiver=new TelevisionReceiver();
        RemoteControlInvoker invoker=new RemoteControlInvoker();
        Command onCommand=new OffCommand(receiver);
        invoker.setCommand(onCommand);
        invoker.pressButton();
    }
}
