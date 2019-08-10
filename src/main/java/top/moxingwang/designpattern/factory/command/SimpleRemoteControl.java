package top.moxingwang.designpattern.factory.command;

/**
 * 遥控器
 */
public class SimpleRemoteControl {
    //具体某个插槽
    private Command slot;



    public void buttonWasPressed() {
        slot.execute();
    }
    public void setSlot(Command slot) {
        this.slot = slot;
    }
}





