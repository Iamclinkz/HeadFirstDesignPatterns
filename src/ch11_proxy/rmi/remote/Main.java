package ch11_proxy.rmi.remote;

import java.rmi.Naming;

public class Main {
    public static void main(String[] args) {
        try{
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("rmi://localhost:1099/MyRemoteService",service);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
