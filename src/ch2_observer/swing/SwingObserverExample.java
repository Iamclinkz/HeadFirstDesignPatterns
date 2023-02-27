package ch2_observer.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();

		JButton button = new JButton("Should I do it?");

		// Without lambdas
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());

		//这里使用了lambda表达式，相当于是创建了一个匿名的类，
		//这个类实现了ActionListener接口中的唯一的方法
		//通过AbstractButton类的addActionListener接口，给button添加observer，
		//当button的内容有变化的时候，会封装成event，作为参数传递给observer的下面这个
		//回调函数，然后执行回调函数。
//		// With lambdas
//		button.addActionListener(event ->
//				System.out.println("Don't do it, you might regret it!")
//		);
//		button.addActionListener(event ->
//				System.out.println("Come on, do it!")
//		);
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	//看了第六章之后再回来看，这里JButton的设计其实也是命令模式。
	//原因如下：
	//1.可以把AngelListener看成是具体的Command类。
	//它符合Command类的"暴露出类似execute()这样的接口，组合到调用者中，供调用者在某个时机使用"的特点
	//2.JButton可以看成是调用者类。即决定执行Command的时机，在特定时机调用Command
	//3.我们的go方法可以看作是客户，将特定的Command（例如本例中的两个Listener实例）注册到调用者中
	//4.具体的actionPerformed方法，例如本例中的System.out.println，可以看作是接收者，作为实际被
	//Command执行时，执行的内容
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}

}
