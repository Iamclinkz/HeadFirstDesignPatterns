package ch9_iterator.menu_iterator;

import ch9_iterator.menu_iterator.menu.Menu;
import ch9_iterator.menu_iterator.menu.impl.DinerMenu;
import ch9_iterator.menu_iterator.menu.impl.PancakeHouseMenu;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("iterator pancakes:");
        while(pancakeHouseMenuIterator.hasNext())
        {
            System.out.println(pancakeHouseMenuIterator.next());
        }
        System.out.println();


        System.out.println("iterator diners:");
        while(dinerMenuIterator.hasNext())
        {
            System.out.println(dinerMenuIterator.next());
        }
        System.out.println();
    }
}
