package ch2_observer;

//主题类，可以被observer们订阅
public interface Subject {
    //暴露给observer的api，让observer注册自身
    void registerObserver(Observer observer);
    void deleteObserver(Observer observer);
    //通知observers，其感兴趣的内容有所变动。具体的实现是调用observer的update方法
    void notifyObservers();
}
