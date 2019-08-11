package top.moxingwang.designpattern.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        for (int i = 0; i < MAX_ITEMS; i++) {
            menuItems[i] = new MenuItem("Pancake brakfast","desc",true,4.6+i);
        }

    }

    public Iterator createIterator() {
        return  new DinerMenuIterator(menuItems);
    }

}
