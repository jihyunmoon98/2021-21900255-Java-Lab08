package edu.handong.csee.java.hw2.converters;
/**
 * homework 2 convertible interface
 * it is kind of logic frame
 * Interface class that has the following methods
 * 
 * @since 2021.04.13
 */
public interface Convertible {
    /**
     * method description for setFromValue
     * @param fromValue this is the input value that user typed 
     */
    public void setFromValue(double fromValue);
    /**
     * method description for getConvertedValue
     * @return this is getter method so it should return the output
    */
    public double getConvertedValue();
    /**
     * method description for convert
     */
    public void convert(); 
    //this is the interface frame
}