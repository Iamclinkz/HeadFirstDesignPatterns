package ch9_iterator.menu_iterator.iterable;

import ch9_iterator.menu_iterator.MenuItem;

import java.util.Iterator;

public class MyIterableImpl implements Iterable<MenuItem> {
    MenuItem[] items;

    public MyIterableImpl(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new MyIteratorImpl(items);
    }
}
