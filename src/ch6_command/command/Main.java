package ch6_command.command;

import ch6_command.RemoteControl;
import ch6_command.command.impl.*;
import ch6_command.receiver.AirConditioner;
import ch6_command.receiver.Door;
import ch6_command.receiver.Light;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //创建receiver
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        Door door = new Door();

        //使用receivers创建command
        LightOpenCmd lightOpenCmd = new LightOpenCmd(light);
        LightCloseCmd lightCloseCmd = new LightCloseCmd(light);
        Command airConditionerOpenCmd = new AirConditionerOpenCmd(airConditioner);
        Command airConditionerCloseCmd = new AirConditionerCloseCmd(airConditioner);
        DoorOpenCmd doorOpenCmd = new DoorOpenCmd(door);
        DoorCloseCmd doorCloseCmd = new DoorCloseCmd(door);

        //装填遥控器
        remoteControl.setCommand(0,lightOpenCmd,lightCloseCmd);
        remoteControl.setCommand(1,airConditionerOpenCmd,airConditionerCloseCmd);
        remoteControl.setCommand(2,doorOpenCmd,doorCloseCmd);

        //查看装填后的遥控器
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);

        System.out.println(remoteControl);

        //testCmdWithLambda();
    }

//    public static void testCmdWithLambda()
//    {
//        System.out.println("===testCmdWithLambda start===");
//        RemoteControl remoteControl = new RemoteControl();
//        Light light = new Light();
//        //我们要求的Command接口只有一个方法：void execute();
//        //所以可以使用lambda表达式来创建一个匿名的实现Command接口的对象，并且让
//        //这个对象实现Command中的execute()方法。这样做可以减少实现Command的类的个数
//        remoteControl.setCommand(0,() -> light.turnOn(), ()-> light.turnOff());
//        System.out.println(remoteControl);
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println("===testCmdWithLambda end===");
//    }
}
