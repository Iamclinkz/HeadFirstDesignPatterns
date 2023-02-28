package ch7_adapter.iterator_adapter;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration<Object> {
    //将iterator适配，使用iterator实现Enumeration接口
    Iterator<?> iterator;

    public IteratorAdapter(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
