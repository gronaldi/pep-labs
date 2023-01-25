package com.revature;

public class MyController {
    @Handler(path = "/mypath", method = HttpMethod.GET)
    public void handle(Context ctx) {
        ctx.result("Hello World!");
    }
}
