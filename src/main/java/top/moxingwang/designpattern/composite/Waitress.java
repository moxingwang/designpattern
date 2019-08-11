package top.moxingwang.designpattern.composite;

public class Waitress {
    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }
}
