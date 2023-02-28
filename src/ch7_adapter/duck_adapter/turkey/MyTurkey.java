package ch7_adapter.duck_adapter.turkey;

public class MyTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("MyTurkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("MyTurkey try to fly...");
    }
}
