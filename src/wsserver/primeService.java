package wsserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class primeService {

    /**
     * @param args the command line arguments
     */
    public String Primzahl() {
        // TODO code application logic here
        boolean abbruch;
        int primeCount = 50;
        String str="";

        for(int i=2;primeCount>0;i++)
        {
            if(!new String(new char[i]).matches("(..+?)\\1+"))
            {
                str=solutionString.add(primeCount,i,str);
                primeCount--;
            }
        }
        return str;
    }
}