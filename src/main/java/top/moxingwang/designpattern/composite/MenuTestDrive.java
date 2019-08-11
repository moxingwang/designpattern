package top.moxingwang.designpattern.composite;

/*测试类*/
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake brakfast", "desc");
        MenuComponent dineMenu = new Menu("Dine brakfast", "desc");
        MenuComponent cafeMenu = new Menu("Cafe brakfast", "desc");
        MenuComponent dessertMenu = new Menu("dessert brakfast", "desc");

        MenuComponent allMenu = new Menu("all ment", "all menu desc");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dineMenu);
        allMenu.add(cafeMenu);

        dineMenu.add(new MenuItem("Pancake brakfast", "desc", true, 4.6));
        dineMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Pancake brakfast", "desc", true, 4.6));

        Waitress waitress = new Waitress(allMenu);

        waitress.printMenu();
    }
}
