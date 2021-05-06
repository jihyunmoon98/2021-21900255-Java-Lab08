package edu.handong.csee.java.hw2.converters;

/**
 * homework 2 one of converter program
 * it use the Convertible interface
 * 
 * @author Jihyun Moon
 * @since 2021.04.13
 */
public class KMToMILEConverter implements Convertible{
    private double outputValue;
    private double inputValue;
    /**
     * this is setting the value in inputValue
     * @param fromValue is the input value that user input for us
    */
    public void setFromValue(double fromValue){
        inputValue = fromValue;
    }
    /**
     * this is send the value when the main want to get variance data
     * @return so it has return instead of param. 
     * to return the value to main
    */
    public double getConvertedValue(){
        return outputValue;
    }
    /**
     * it is calculating part.
     */
    public void convert(){
        outputValue = inputValue/1.6;
    }
}