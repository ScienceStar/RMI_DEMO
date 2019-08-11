package server;

import impl.HelloServiceImpl;
import intel.IHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {
        try{
            IHelloService helloService = new HelloServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1/Hello",helloService);
            System.out.println("服务启动成功................");
        }catch (RemoteException | MalformedURLException e){
            e.printStackTrace();
        }

    }
}
