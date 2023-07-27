
package rmi;
import java.rmi.Remote;
public interface LoginInterface extends Remote{
    public boolean check(String id,String pwd)throws Exception;
}
