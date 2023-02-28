package ch8_template_method.string_list;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] strings = {
            "AAA",
            "BBB",
            "CCC",
        };
        //我们的MyStringList并没有实现迭代器方法，
        //但是通过实现了get和size两个抽象函数，通过基类的模版方法返回了迭代器。
        MyStringList list = new MyStringList(strings);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
