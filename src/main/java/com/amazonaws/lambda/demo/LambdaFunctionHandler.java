package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<MyLambdaRequest, String> {

    @Override
    public String handleRequest(MyLambdaRequest input, Context context) {
    	context.getLogger().log("Input: " + input.getName());

        // TODO: implement your handler
        return "Hello from Lambda! "+input.getName();
    }

}