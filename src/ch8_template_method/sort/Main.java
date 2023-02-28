package ch8_template_method.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyDuck smallDuck = new MyDuck(10,"small duck");
        MyDuck bigDuck = new MyDuck(2000,"big duck");
        MyDuck midDuck = new MyDuck(11,"mid duck");

        MyDuck[] ducks = {
                smallDuck,
                bigDuck,
                midDuck
        };
        System.out.println("before sort:");
        for(MyDuck duck : ducks)
        {
            System.out.println(duck.name);
        }

        System.out.println("\nafter sort:");
        Arrays.sort(ducks);

        for(MyDuck duck : ducks)
        {
            System.out.println(duck.name);
        }
    }
}
