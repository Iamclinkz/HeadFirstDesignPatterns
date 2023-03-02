package ch10_state.state;

//当我们面对可能增加的状态，以及不会改变的动作的时候，可以通过把状态设置成接口，
//并且将每个动作作为接口中的一个方法来实现。
//这样每个状态中的每个动作，就是在当前状态下，用户做出该动作时，我们应该给出的反应。
//这些反应包括直接给用户的反馈，以及内部状态的变换。
//另一种思考是把动作抽象成一个接口，然后把例如 onHasQuarterState() 作为抽象成的动作类的方法
//但是这样的话，在口香糖机中应该会有根据当前的state，以及用户的动作（用户调用了口香糖机的哪个方法）
//来决定调用对应动作的onState回调函数。不如现在的直接 state.onAction() 方便
public interface State {
    //投入硬币
    public void insertQuarter();
    //弹出硬币
    public void ejectQuarter();
    //转动旋钮
    public void turnCrank();
    //发出糖奖励
    public void dispense();
    //重新填满口香糖
    public void refill();
}
