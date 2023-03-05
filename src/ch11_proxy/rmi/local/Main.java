package ch11_proxy.rmi.local;

public class Main {
    public static void main(String[] args) throws Exception{
        MyRemoteClient client = new MyRemoteClient();
        client.go();
    }
}
