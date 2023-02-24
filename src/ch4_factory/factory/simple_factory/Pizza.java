package ch4_factory.factory.simple_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public List<String> toppings = new ArrayList<>();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
