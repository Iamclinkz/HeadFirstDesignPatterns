package ch11_proxy.image_proxy.image_proxy_with_state.state.impl;

import ch11_proxy.image_proxy.image_proxy_with_state.state.State;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconState implements State {
    final ImageIcon imageIcon;
    final URL imageURL;

    public ImageIconState(ImageIcon imageIcon, URL imageURL) {
        this.imageIcon = imageIcon;
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c,g,x,y);
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
