package ch9_iterator.menu_iterator.iterable;

import ch9_iterator.menu_iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyIterableImpl menuItems = new MyIterableImpl(new MenuItem[]{
                new MenuItem("name1","des1",false,10.0),
                new MenuItem("name2","des2",true,11.0),
                new MenuItem("name3","des3",false,12.0),
                new MenuItem("name4","des4",false,13.0),
                new MenuItem("name5","des5",false,14.0),
        });

        //第一种遍历的方式，因为java有对于Iterable接口实现的语法糖，
        //并且MyIterableImpl实现了Iterable接口，所以可以用这种方式进行遍历
        for(MenuItem num : menuItems)
            System.out.println(num);

        //第二种遍历方式，直接取出来迭代器进行遍历
        Iterator<MenuItem> iterator = menuItems.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //第三种方式，使用Iterable接口的Foreach方法，配合lambda表达式使用
        menuItems.forEach(menuItem -> System.out.println(menuItem));
    }
}
