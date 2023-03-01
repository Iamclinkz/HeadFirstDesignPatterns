package ch9_iterator.compose.component_impl;

import ch9_iterator.compose.Component;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Component {
    private final List<Component> components;
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.components = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void addChild(Component child)
    {
        components.add(child);
    }

    @Override
    public void removeChild(Component child)
    {
        components.remove(child);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public void print()
    {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for(Component child : components)
        {
            child.print();
        }
    }
}
