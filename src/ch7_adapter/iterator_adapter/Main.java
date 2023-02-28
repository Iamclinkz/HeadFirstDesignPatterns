package ch7_adapter.iterator_adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        IteratorAdapter adapter = new IteratorAdapter(list.iterator());

        while(adapter.hasMoreElements())
        {
            System.out.println(adapter.nextElement());
        }
    }
}
