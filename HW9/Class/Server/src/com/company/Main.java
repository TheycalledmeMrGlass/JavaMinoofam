package com.company;
import java.rmi.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            ServiceImplementor serviceImplementor=new ServiceImplementor();
            Naming.rebind("Service",serviceImplementor);
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
	// write your code here
    }
}
