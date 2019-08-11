package top.moxingwang.designpattern.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList() ;

        menuItems.add(new MenuItem("Pancake brakfast","desc",true,4.6));
        menuItems.add(new MenuItem("Pancake brakfast","desc",true,4.6));
        menuItems.add(new MenuItem("Pancake brakfast","desc",true,4.6));
        menuItems.add(new MenuItem("Pancake brakfast","desc",true,4.6));
    }

    public Iterator createIterator() {
        return  new PancakeHouseMenuIterator(menuItems);
    }


}
