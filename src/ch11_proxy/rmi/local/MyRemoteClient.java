package ch11_proxy.rmi.local;

import ch11_proxy.rmi.MyRemote;

import java.rmi.Naming;

public class MyRemoteClient {
    public void go() throws Exception{
        MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:8080/MyRemoteService");
        System.out.println(service.sayHello());
    }
}
