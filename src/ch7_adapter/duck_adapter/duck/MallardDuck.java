package ch7_adapter.duck_adapter.duck;

public class MallardDuck implements Duck{
    @Override
    public void quark() {
        System.out.println("MallardDuck quark");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }
}
