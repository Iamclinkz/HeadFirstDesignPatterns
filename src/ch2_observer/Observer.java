package ch2_observer;

public interface Observer {
    //暴露给主题类的，当内容发生变化时，由主题类进行的回调
    void update();
}
