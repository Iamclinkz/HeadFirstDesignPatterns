package ch10_state.state.impl;

import ch10_state.GumballMachine;
import ch10_state.state.State;

public class NoQuarterState implements State {
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("insert coin success");
        machine.setState(machine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("there is no input coins, eject failed");
    }

    @Override
    public void turnCrank() {
        System.out.println("please insert a coin before turn the crank!");
    }

    @Override
    public void dispense() {
        System.out.println("please insert a coin and turn the crank!");
    }

    @Override
    public void refill() {

    }
}
