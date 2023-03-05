package ch11_proxy.image_proxy.image_proxy_with_state;

import ch11_proxy.image_proxy.image_proxy_with_state.state.State;
import ch11_proxy.image_proxy.image_proxy_with_state.state.impl.ProxyState;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    State state;
    final URL imageURL;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
        this.state = new ProxyState(imageURL,this);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        state.paintIcon(c,g,x,y);
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    public void changeState(State state)
    {
        this.state = state;
    }
}
