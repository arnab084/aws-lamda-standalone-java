package com.helloworld.lamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<Object, SampleResponse> {

    @Override
    public SampleResponse handleRequest(Object object, Context context) {

        String message = "Hello from Arnab";
        System.out.println(message);

        SampleResponse response = new SampleResponse(
                message,
                200
        );
        return response;
    }
}