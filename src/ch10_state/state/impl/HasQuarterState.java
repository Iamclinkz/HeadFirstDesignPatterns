package ch10_state.state.impl;

import ch10_state.GumballMachine;
import ch10_state.state.State;

import java.util.Random;

//有硬币在内部的状态
public class HasQuarterState implements State {
    GumballMachine machine;
    Random random = new Random();

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("there is no need to insert another coin!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject success");
        this.machine.setState(machine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("turn crank success");

        if(random.nextInt() % 10 == 0)
        {
            System.out.println("congratulations! you are the winner!");
            machine.setState(machine.winnerState);
        }else{
            machine.setState(machine.soldState);
        }
    }

    @Override
    public void dispense() {
        System.out.println("you need to turn crank first");
    }

    @Override
    public void refill() {

    }
}
