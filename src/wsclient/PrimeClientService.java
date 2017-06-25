
package wsclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "primeClientService", targetNamespace = "http://wsserver/", wsdlLocation = "http://localhost:1212/prim?wsdl")
public class PrimeClientService
    extends Service
{

    private final static URL PRIMECLIENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRIMECLIENTSERVICE_EXCEPTION;
    private final static QName PRIMECLIENTSERVICE_QNAME = new QName("http://wsserver/", "primeClientService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1212/prim?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRIMECLIENTSERVICE_WSDL_LOCATION = url;
        PRIMECLIENTSERVICE_EXCEPTION = e;
    }

    public PrimeClientService() {
        super(__getWsdlLocation(), PRIMECLIENTSERVICE_QNAME);
    }

    public PrimeClientService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRIMECLIENTSERVICE_QNAME, features);
    }

    public PrimeClientService(URL wsdlLocation) {
        super(wsdlLocation, PRIMECLIENTSERVICE_QNAME);
    }

    public PrimeClientService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRIMECLIENTSERVICE_QNAME, features);
    }

    public PrimeClientService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrimeClientService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PrimeClient
     */
    @WebEndpoint(name = "primeClientPort")
    public PrimeClient getPrimeClientPort() {
        return super.getPort(new QName("http://wsserver/", "primeClientPort"), PrimeClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PrimeClient
     */
    @WebEndpoint(name = "primeClientPort")
    public PrimeClient getPrimeClientPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsserver/", "primeClientPort"), PrimeClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRIMECLIENTSERVICE_EXCEPTION!= null) {
            throw PRIMECLIENTSERVICE_EXCEPTION;
        }
        return PRIMECLIENTSERVICE_WSDL_LOCATION;
    }

}
