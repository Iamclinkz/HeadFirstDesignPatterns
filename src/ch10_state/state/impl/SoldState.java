package ch10_state.state.impl;

import ch10_state.GumballMachine;
import ch10_state.state.State;

public class SoldState implements State {
    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait for the transaction finish!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("please wait for the transaction finish!");
    }

    @Override
    public void turnCrank() {
        System.out.println("please wait for the transaction finish!");
    }

    @Override
    public void dispense() {
        System.out.println("pop out a gumball!");
        machine.gumballCount -= 1;
        if(machine.gumballCount == 0)
        {
            machine.setState(machine.soldOutState);
        }else{
            machine.setState(machine.noQuarterState);
        }
    }

    @Override
    public void refill() {

    }
}
