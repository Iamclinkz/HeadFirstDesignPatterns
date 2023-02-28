package ch8_template_method.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    //通过override这个JFrame提供的hook方法，驱动JFrame进行操作
    //JFrame会在自己的模版方法中进行
    @Override
    public void paint(Graphics graphics)
    {
        super.paint(graphics);

        String msg = "hello world!";
        graphics.drawString(msg,100,100);
    }
}
