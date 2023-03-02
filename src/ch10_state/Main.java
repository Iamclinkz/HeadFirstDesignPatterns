package ch10_state;

public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5,5);

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.turnCrank();
        machine.ejectQuarter();
    }
}
