package com.revature;

import io.javalin.Javalin;
import io.javalin.apibuilder.EndpointGroup;


public class App 
{
    /*
     * You could run this method to start the server, and then access it using the 'curl' command. For example, you can
     * type into a terminal the following command:
     *      curl localhost:9000/hello/
     * Before this endpoint will return any information to you request, you will need to write that logic in
     * JavalinSingleton.java
     */
    public static void main(String[] args) {
        Javalin.create().start(9000).routes((EndpointGroup) new MyController());
    }