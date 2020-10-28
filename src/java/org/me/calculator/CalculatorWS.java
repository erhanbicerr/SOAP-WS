/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.lang.Math;

/**
 *
 * @author erhan
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "add")
    public double add(@WebParam(name = "i") double i, @WebParam(name = "j") double j) {
        double k = i + j;
        return k;
    }
    
    @WebMethod(operationName = "sub")
    public double sub(@WebParam(name = "i") double i, @WebParam(name = "j") double j) {
        double k = i - j;
        return k;
    }
    
    @WebMethod(operationName = "mul")
    public double mul(@WebParam(name = "i") double i, @WebParam(name = "j") double j) {
        double k = i + j;
        return k;
    }
    
    @WebMethod(operationName = "div")
    public double div(@WebParam(name = "i") double i, @WebParam(name = "j") double j) {
        double k = i - j;
        return k;
    }
    
    @WebMethod(operationName = "sqrt")
    public double sqrt(@WebParam(name = "i") double i) {
        double k = Math.sqrt(i);
        return k;
    }
    
    @WebMethod(operationName = "pow")
    public double pow(@WebParam(name = "i") double i, @WebParam(name = "pow") int pow) {
        double k = Math.pow(i,pow);
        return k;
    }
    
    
    
}
