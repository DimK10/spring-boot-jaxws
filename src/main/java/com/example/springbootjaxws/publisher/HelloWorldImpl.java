package com.example.springbootjaxws.publisher;


import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.example.springbootjaxws.publisher.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}