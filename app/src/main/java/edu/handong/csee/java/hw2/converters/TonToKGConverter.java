package edu.handong.csee.java.hw2.converters;

/**
 * homework 2 one of converter program
 * it use the Convertible interface
 * 
 * @author Jihyun Moon
 * @since 2021.04.13
 */
public class TONToKGConverter implements Convertible{
    private double outputValue;
    private double inputValue;

    /**
     * setting the fromValue to input Value
     * @param fromValue this is input value that user gave 
    */
    public void setFromValue(double fromValue){
        inputValue = fromValue;
    }
    /**
     * return the value and main will got the value
     * @return outputValue
     */
    public double getConvertedValue(){
        return outputValue;
    }
    //convert tom to kg
      /**
     * it is calculating part.
     */
    public void convert(){
        outputValue = inputValue * 1000;
    }
}