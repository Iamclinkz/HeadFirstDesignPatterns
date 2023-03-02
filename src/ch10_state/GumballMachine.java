package ch10_state;

import ch10_state.state.State;
import ch10_state.state.impl.*;

public class GumballMachine{
    State state;
    public int gumballCount;
    public int maxGumballCount;

    //在这里缓存了所有可能的变化。实际上也可以不用缓存，
    //但是为了方便各个State中的方法可以感知到其他的State，并且通过GumballMachine
    //就可以切换到其他方法，我们最终还是缓存了。
    public State noQuarterState;
    public State hasQuarterState;
    public State soldState;
    public State winnerState;
    public State soldOutState;


    public GumballMachine(int gumballCount,int maxGumballCount) {
        this.gumballCount = gumballCount;

        //初始化状态
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.soldOutState = new SoldOutState(this);

        this.maxGumballCount = maxGumballCount;
        if(maxGumballCount < gumballCount)
            throw new RuntimeException("fill too many gumballs!");

        if(1 > maxGumballCount)
            throw new RuntimeException("max gumball num should be at lest 1!");

        //根据初始的硬币的值，决定一开始是什么状态
        if(gumballCount > 0)
            this.state = noQuarterState;
        else
            this.state = soldOutState;
    }

    //State接口的实例们通过调用这个方法，切换口香糖机的当前的State
    public void setState(State state)
    {
        this.state = state;
    }

    //通过这种方式，我们在口香糖机这里可以完全不用操心state的切换
    //state实例自己知道自己可以在当前state下，用户执行什么操作后，切换到下一个state
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void refill()
    {
        //如果提供给上层的api，像这个api一样，明确的希望修改某个context持有的变量
        //那么应该放到context这层修改，而不是让State类们修改
        //这样一方面可以增加代码的复用性（每次多加一个State，都要修改一下变量）
        //另一方面可以将维护context的内部的变量的责任收拢与context，而不是state
        refillGumballs();
        state.refill();
    }

    public void refillGumballs()
    {
        this.gumballCount = maxGumballCount;
    }
}
