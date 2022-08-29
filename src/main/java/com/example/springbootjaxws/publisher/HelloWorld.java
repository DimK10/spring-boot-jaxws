package com.example.springbootjaxws.publisher;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
//@SOAPBinding(style = Style.DOCUMENT)
public interface HelloWorld{

    @WebMethod
    String getHelloWorldAsString(String name);

}
