package ch9_iterator.compose;

public class Component {
    //假设这个是真正需要叶子节点提供的功能性方法
    public void print()
    {
        //因为这里暴露的方法是叶子结点和分支节点希望暴露给客户端的所有的方法的并集，
        //所以有部分方法是只能叶子结点使用，有一部分方法是只能分支节点使用（例如addChild）。
        //所以为了在用户错误的调用方法（例如在叶子节点调用addChild方法)时让用户感知，
        //同时让子类只覆盖自己有用的方法，Component被设计成虚类，并且所有的方法都抛异常。
        throw new UnsupportedOperationException();
    }

    public void addChild(Component child)
    {
        //如果是叶子节点调用了这个方法，可以选择抛出异常，也可以选择直接return。这里暂时选择抛出异常
        throw new UnsupportedOperationException();
    }

    public void removeChild(Component child)
    {
        throw new UnsupportedOperationException();
    }

    //下面的两个接口，包括print接口相当于是暴露给用户使用的。因为它对Menu和MenuItem都有意义
    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }
}
