package top.moxingwang.designpattern.factory.command;

import top.moxingwang.designpattern.factory.command.driver.Sound;

public class SoundCommand implements Command {
    private Sound sound;

    public SoundCommand(Sound sound) {
        this.sound = sound;
    }

    public void execute() {
        sound.up();
    }
}
