package ch7_adapter.duck_adapter;

import ch7_adapter.duck_adapter.duck.Duck;

//扮演adapter设计模式中"client"角色，面向Duck编程，而不关心实现Duck接口的到底是什么
public class DuckUser {
    Duck duck;

    public DuckUser(Duck duck) {
        this.duck = duck;
    }

    public void useDuck(){
        duck.fly();
        duck.quark();
    }
}
