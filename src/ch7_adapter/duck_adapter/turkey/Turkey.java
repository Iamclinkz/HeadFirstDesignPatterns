package ch7_adapter.duck_adapter.turkey;

//扮演adapter设计模式中"adaptee"角色，即被adapter组合到内部，
//实际提供功能的角色。
public interface Turkey {
    void gobble();
    void fly();
}
