/**
 * 
 */
package com.amazonaws.lambda.demo;

/**
 * @author deshmukj
 *
 */
public class MyLambdaRequest
{
    String name;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "MyLambdaRequest [name=" + name + "]";
    }
}