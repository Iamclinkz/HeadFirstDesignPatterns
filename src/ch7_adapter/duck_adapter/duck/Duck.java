package ch7_adapter.duck_adapter.duck;

//扮演adapter设计模式中"target"角色，用户面向Duck编程，而不关心实现Duck接口的到底是什么
public interface Duck {
    void quark();
    void fly();
}
