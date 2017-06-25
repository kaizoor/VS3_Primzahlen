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
    public String Primzahl(int target) {
        // TODO code application logic here
        boolean abbruch;
        String str="";
        int primeCount=0;
        for(int i=2;target>primeCount;i++)
        {
            if(!new String(new char[i]).matches("(..+?)\\1+"))
            {
                primeCount++;
                str=solutionString.add(primeCount,i,str);
            }
        }
        return str;
    }
}