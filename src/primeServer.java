
package com.tutego.insel.ws;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;


@WebService(name = "VerteilteSysteme")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class primeServer {

    @WebMethod
    public String hello(String name) {
        return "Hello " + name + "!";
    }

    @WebMethod(operationName = "body-mass-index")
    @WebResult(name = "your-bmi")
    public double bmi(@WebParam(name = "height") double height,
                      @WebParam(name = "weight") double weight) {
        return weight / ((height * height) / 10000);
    }


    public static void main(String[] args) {
        Endpoint prime = Endpoint.publish("http://localhost:8080/services",
                new primeServer());
        JOptionPane.showMessageDialog(null, "Server beenden");
        prime.stop();
    }
}