package ch7_adapter.duck_adapter;

import ch7_adapter.duck_adapter.duck.Duck;
import ch7_adapter.duck_adapter.duck.MallardDuck;
import ch7_adapter.duck_adapter.turkey.MyTurkey;
import ch7_adapter.duck_adapter.turkey.Turkey;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new MyTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        Duck mallardDuck = new MallardDuck();

        DuckUser duckUser1 = new DuckUser(turkeyAdapter);
        DuckUser duckUser2 = new DuckUser(mallardDuck);

        duckUser1.useDuck();
        System.out.println();
        duckUser2.useDuck();
    }
}
