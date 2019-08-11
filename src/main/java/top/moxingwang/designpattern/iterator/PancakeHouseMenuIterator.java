package top.moxingwang.designpattern.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList menuItems;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return menuItems.iterator().hasNext();
    }

    public Object next() {
        return menuItems.iterator().next();
    }
}
