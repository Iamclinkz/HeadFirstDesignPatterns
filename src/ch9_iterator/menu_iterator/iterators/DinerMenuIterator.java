package ch9_iterator.menu_iterator.iterators;

import ch9_iterator.menu_iterator.MenuItem;
import ch9_iterator.menu_iterator.menu.impl.DinerMenu;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private int position = 0;
    private final DinerMenu menu;

    public DinerMenuIterator(DinerMenu menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        return this.position < menu.getMenuItems().length
                && menu.getMenuItems()[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = menu.getMenuItems()[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
