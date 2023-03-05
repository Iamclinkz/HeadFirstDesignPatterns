package ch11_proxy.image_proxy;

import javax.swing.*;
import java.awt.*;

//不同方式实现的ImageProxy所在的Component。每个Component可以内置
//许多个例如Icon这样的组件。在paintComponent方法中，应该在上层将所有的内部的icon
//的位置，大小设定好，然后再依次的调用各个icon的paintIcon方法，并且传入this，
//希望icon展示的位置等参数。让icon进行展示
public class ImageComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w)/2;
		int y = (600 - h)/2;
		//调用icon的print方法， 展示icon
		icon.paintIcon(this, g, x, y);
	}
}
