package ch7_adapter.duck_adapter;

import ch7_adapter.duck_adapter.duck.Duck;
import ch7_adapter.duck_adapter.turkey.Turkey;

//注意，叫XXXAdapter的，XXX指的是adaptee的类型，而不是Target的类型。。。
//这里的XXXAdapter指的是对XXX进行adapter
//在本例中，对Turkey进行包装，实现Duck接口
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quark() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }
}
