package ch10_state.state.impl;

import ch10_state.GumballMachine;
import ch10_state.state.State;

public class SoldOutState implements State {
    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("there is no gumballs... please stop insert coins");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject failed");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn crank failed");
    }

    @Override
    public void dispense() {
        System.out.println("there is no gumballs... dispense failed");
    }

    @Override
    public void refill() {
        this.machine.setState(this.machine.noQuarterState);
    }
}
