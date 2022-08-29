package com.example.springbootjaxws.publisher;


import org.springframework.stereotype.Service;
import javax.xml.ws.Endpoint;

@Service
public class HelloWorldPublisher {

    public HelloWorldPublisher() {
        Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
    }
}
