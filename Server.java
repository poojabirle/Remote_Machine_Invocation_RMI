
package rmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server {


    public static void main(String[] args)throws Exception {
        Registry reg=LocateRegistry.createRegistry(2001);
        System.out.println("server is ready");
        
        CheckLogin cl=new CheckLogin();
        reg.bind("AUTH",cl);
    }
    
}
