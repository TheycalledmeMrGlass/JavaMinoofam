package com.company;
import java.net.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            ServiceImplementor serviceImplementor=new ServiceImplementor();
            Naming.rebind("Service",serviceImplementor);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (RemoteException f){
            f.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
