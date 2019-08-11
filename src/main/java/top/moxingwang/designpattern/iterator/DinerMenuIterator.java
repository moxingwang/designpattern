package top.moxingwang.designpattern.iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return true;
        }
        return false;
    }

    public Object next() {
        position = position + 1;
        return menuItems[position];
    }
}
