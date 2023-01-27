package com.revature;

import org.eclipse.jetty.http.HttpMethod;

import io.javalin.http.Context;

public class MyController {
    @Handler(path = "/mypath", method = HttpMethod.GET)
    public void handle(Context ctx) {
        ctx.result("Hello World!");
    }
}
