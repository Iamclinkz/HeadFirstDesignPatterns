package ch9_iterator.menu_iterator.iterable;

import ch9_iterator.menu_iterator.MenuItem;

import java.util.Iterator;

public class MyIteratorImpl implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position;

    public MyIteratorImpl(MenuItem[] items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return items.length > position &&
                items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return  menuItem;
    }
}
