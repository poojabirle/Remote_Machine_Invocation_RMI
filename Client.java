package rmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args)throws Exception
    {

        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter server name");
        String serverName=sc.next(); 
        System.out.println("Enter port no");
        int portNo=sc.nextInt();
        System.out.println("Enter unique id");
        String uId=sc.next(); 
        System.out.println("Enter id and password");
        String id=sc.next(); 
        String pwd=sc.next();

        Registry reg=LocateRegistry.getRegistry(serverName,portNo);
        LoginInterface li=(LoginInterface)reg.lookup(uId);//AUTH 
        boolean bool=li.check(id,pwd);
        if(bool)
        {
            System.out.println("Hello world");
        }
        else
        {
            System.out.println("something is wrong");
        }
    }
}