package ch3_wrapper.myIO;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {
    //看101页的类图，FilterInputStream是所有的装饰者类的基类
    //如果我们希望通过装饰者模式拓展例如FileInputStream的功能，那么就需要
    //构造一个装饰者，而构造装饰者需要继承装饰者基类。
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    //通过override掉InputStream的方法，来实现给wrapped
    //添加功能的作用
    @Override
    public int read() throws IOException {
        //通过wrapped，读取一个字节
        int c = in.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }
}
