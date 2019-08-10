package top.moxingwang.designpattern.factory.command;

import top.moxingwang.designpattern.factory.command.driver.Light;
import top.moxingwang.designpattern.factory.command.driver.Sound;

public class App {
    public static void  main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        LightCommand lightCommand = new LightCommand(new Light());
        SoundCommand soundCommand = new SoundCommand(new Sound());
        control.setSlot(lightCommand);
        control.buttonWasPressed();
        control.setSlot(soundCommand);
        control.buttonWasPressed();
    }
}

