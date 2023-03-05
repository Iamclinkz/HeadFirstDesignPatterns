package ch11_proxy.image_proxy.image_proxy_normal;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) { imageURL = url; }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    //set方法使用了synchronized关键字，防止多个线程同时写入imageIcon变量
    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics  g, int x,  int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading album cover, please wait...", x+300, y+190);
            if (!retrieving) {
                retrieving = true;

                retrievalThread = new Thread(() -> {
                    try {
                        //new ImageIcon()方法需要经历从网上拉取image的过程，所以可能时间较长
                        //通过使用这种加载好，再赋值imageIcon，从而让proxy感知到的行为，可以让proxy先执行一个
                        //预表现展示，等到加载好了，再通过加载好的imageIcon进行实际的展示。
                        setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();

            }
        }
    }
}
