package ch9_iterator.menu_iterator.iterators;

import ch9_iterator.menu_iterator.MenuItem;
import ch9_iterator.menu_iterator.menu.impl.PancakeHouseMenu;

import java.util.Iterator;

public class PancakeMenuIterator implements Iterator<MenuItem> {
    private int position = 0;
    private final PancakeHouseMenu menu;

    public PancakeMenuIterator(PancakeHouseMenu menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        return this.position < menu.getMenuItems().size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = menu.getMenuItems().get(position);
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
