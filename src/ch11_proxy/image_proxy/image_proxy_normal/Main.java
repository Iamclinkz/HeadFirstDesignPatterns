package ch11_proxy.image_proxy.image_proxy_normal;

import ch11_proxy.image_proxy.ImageComponent;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {
    //ImageComponent继承与JComponent，是JFrame中的一个控件，被加载到JFrame中使用
    ImageComponent imageComponent;
    //JFrame是个用于展示的窗口
    JFrame frame = new JFrame("Album Cover Viewer");
    //JFrame中的菜单栏
    JMenuBar menuBar;
    //用于装入到JMenuBar中的一个菜单
    JMenu menu;
    //用于展示的图片的名称和url
    Hashtable<String, String> albums = new Hashtable<String, String>();


    public static void main(String[] args) throws Exception{
        Main main = new Main();
    }

    public Main() throws Exception {
        albums.put("图片1","http://e.hiphotos.baidu.com/image/pic/item/a1ec08fa513d2697e542494057fbb2fb4316d81e.jpg");
        albums.put("图片2","http://c.hiphotos.baidu.com/image/pic/item/30adcbef76094b36de8a2fe5a1cc7cd98d109d99.jpg");
        albums.put("图片3","http://h.hiphotos.baidu.com/image/pic/item/7c1ed21b0ef41bd5f2c2a9e953da81cb39db3d1d.jpg");
        albums.put("图片4","http://g.hiphotos.baidu.com/image/pic/item/55e736d12f2eb938d5277fd5d0628535e5dd6f4a.jpg");
        albums.put("图片5","http://e.hiphotos.baidu.com/image/pic/item/4e4a20a4462309f7e41f5cfe760e0cf3d6cad6ee.jpg");
        albums.put("图片6","http://b.hiphotos.baidu.com/image/pic/item/9d82d158ccbf6c81b94575cfb93eb13533fa40a2.jpg");

        URL initialURL = new URL((String)albums.get("图片1"));
        menuBar = new JMenuBar();
        menu = new JMenu("测试图片");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = albums.keys(); e.hasMoreElements();) {
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
                frame.repaint();
            });
        }

        //装载各种控件
        Icon icon = new ImageProxy(initialURL);
        //这里把我们自己的带有proxy的ImageComponent，装载到了JFrame窗口中
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

    }

    URL getAlbumUrl(String name) {
        try {
            return new URL((String)albums.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
