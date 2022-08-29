package com.example.springbootjaxws.client;

import com.example.springbootjaxws.publisher.HelloWorld;
import com.example.springbootjaxws.publisher.HelloWorldPublisher;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@org.springframework.stereotype.Service
@DependsOn("helloWorldPublisher")
public class HelloWorldClient {


    public HelloWorldClient() throws MalformedURLException {
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://publisher.springbootjaxws.example.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(com.example.springbootjaxws.publisher.HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("springbootjaxws rpc"));

    }
}
