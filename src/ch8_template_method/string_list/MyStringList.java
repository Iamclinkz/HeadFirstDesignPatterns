package ch8_template_method.string_list;

import java.util.AbstractList;

//这里的AbstractList，内部封装了一系列的模版方法。借助于让继承AbstractList的子类实现部分的抽象方法
//（例如下面的get和size方法是必须实现的，其他的方法，例如remove，如果有需要使用其他api(例如removeRange），
//则必须要实现，但是例如如果没有实现remove，就使用了调用remove的模版方法，会抛异常），
//向使用者提供模板方法。这个例子非常好的体现了模版方法模式的作用。即让用户可以通过继承基类，以及实现几个较少的
//方法，就可以通过这几个较少的方法，构建出完整的模版方法，从而暴露给用户使用。
public class MyStringList extends AbstractList<String> {
    private final String[] list;

    public MyStringList(String[] list) {
        this.list = list;
    }

    @Override
    public String get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return list.length;
    }
}
