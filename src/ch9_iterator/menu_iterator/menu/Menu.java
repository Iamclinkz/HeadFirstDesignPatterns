package ch9_iterator.menu_iterator.menu;

import ch9_iterator.menu_iterator.MenuItem;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
