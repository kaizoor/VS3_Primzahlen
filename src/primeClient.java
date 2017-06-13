package VS3_Primzahlen.src;

import javax.xml.ws.Response;
import java.net.*;
import java.util.*;
import java.xml.soap;

public class primeClient {
    public static void main(String[] args) {
        String sServiceUrl = "http://localhost/soap/servlet/rpcrouter";
        String sServiceUri = "urn:primeServer";  // must match primeServer.xml
        String sMethodName = "getMessage";
        String sInput = (0 < args.length) ? args[0] : "MeinName";
        Response resp;

        try {
            Vector params = new Vector();
            params.addElement(new Parameter("sInput", sInput.getClass(),
                    sInput, null));
            Call call = new Call();
            call.setTargetObjectURI(sServiceUri);
            call.setMethodName(sMethodName);
            call.setEncodingStyleURI(Constants.NS_URI_SOAP_ENC);
            call.setParams(params);
            resp = call.invoke(new URL(sServiceUrl), sServiceUri);
        } catch (Exception ex) {
            System.err.println("Error while calling '" + sMethodName + "':");
            System.err.println(ex.getMessage());
            return;
        }

        if (resp.generatedFault()) {
            System.out.println("Call to '" + sMethodName + "' returned a fault:");
            System.err.println(resp.getFault());
        } else {
            if (null != resp.getReturnValue()) {
                Object result = resp.getReturnValue().getValue();
                if (null != result) {
                    System.out.println("'" + sMethodName + "' returned an object of "
                            + result.getClass() + ": ");
                    System.out.println(result);
                }
            }
        }
    }
}