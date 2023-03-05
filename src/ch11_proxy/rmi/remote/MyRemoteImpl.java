package ch11_proxy.rmi.remote;

import ch11_proxy.rmi.MyRemote;

import java.io.Serial;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote   {
    @Serial
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {

    }

    @Override
    public String sayHello() {
        return "hello from server";
    }
}
