package top.moxingwang.designpattern.factory.templatemethod;

public class App {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
