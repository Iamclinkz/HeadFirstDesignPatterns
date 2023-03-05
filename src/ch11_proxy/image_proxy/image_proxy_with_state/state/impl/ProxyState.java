package ch11_proxy.image_proxy.image_proxy_with_state.state.impl;

import ch11_proxy.image_proxy.image_proxy_with_state.ImageProxy;
import ch11_proxy.image_proxy.image_proxy_with_state.state.State;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ProxyState implements State {
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    ImageProxy imageProxy;

    public ProxyState(URL imageURL, ImageProxy imageProxy) {
        this.imageURL = imageURL;
        this.imageProxy = imageProxy;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("正在加载中...", x+300, y+190);
        if (!retrieving) {
            retrieving = true;

            retrievalThread = new Thread(() -> {
                try {
                    //根据传入的url，加载imageIcon，加载完成之后，将其赋值给imageIconState，并且
                    //赋值给imageIconState，并且让imageProxy切换状态。
                    //这里实际上proxyState是依赖于ImageIconState的，因为需要在这里创建一个ImageIconState，
                    //并且加载到上层的component之中。但是proxy模式下，本来就是proxy依赖于handler的，
                    //所以总要破坏一个设计模式，来成全另一个设计模式。
                    ImageIcon imageIcon = new ImageIcon(imageURL, "Album Cover");
                    ImageIconState imageIconState = new ImageIconState(imageIcon, imageURL);
                    imageProxy.changeState(imageIconState);
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            retrievalThread.start();
        }
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
