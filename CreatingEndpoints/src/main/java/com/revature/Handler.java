package com.revature;

import org.eclipse.jetty.http.HttpMethod;

public @interface Handler {

    HttpMethod method();

}
