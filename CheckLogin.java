
package rmi;
import java.rmi.server.UnicastRemoteObject;
public class CheckLogin extends UnicastRemoteObject implements LoginInterface
{
    CheckLogin()throws Exception{}
    @Override
    public boolean check(String id, String pwd)throws Exception
    {
        if(id.equals("abc") && pwd.equals("abc"))
            return true;
        else
            return false;
    }

}

