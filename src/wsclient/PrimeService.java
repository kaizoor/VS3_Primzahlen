
package wsclient;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "primeService", targetNamespace = "http://wsserver/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PrimeService {


    /**
     * 
     */
    @WebMethod(operationName = "Primzahl")
    @Action(input = "http://wsserver/primeService/PrimzahlRequest", output = "http://wsserver/primeService/PrimzahlResponse")
    public String primzahl();

}
