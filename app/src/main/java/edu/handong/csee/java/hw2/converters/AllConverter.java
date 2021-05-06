package edu.handong.csee.java.hw2.converters;
/**
 * homework 2. when the user input 'all' for target measurement
 * 
 * @author Jihyun Moon
 * @since 2021.04.13
 */
public class AllConverter{
    /**
     * it make an variance to get the info and sent the result
     * output has 2 variance cause when the user choose all it print out 2 result
     * inputValue is the user input value 
     */
    private double inputValue;
    private double outputValue1;
    private double outputValue2;
    /**
     *  originalMea is the user input that has the measure
     */
    private String originalMea; //originalMea is the user input that has the measure

    /**
     * default constructor, class constructor 
    */
    public AllConverter(){
        this.inputValue=0;
        this.outputValue1=0;
        this.outputValue2=0;   
    }
    /**
     * set the input value in inputValue
     * @param fromValue it getting the inputValue from the main args 
     * @return return this is logic to set message
     */
    public AllConverter setFromValue(double fromValue){
        inputValue = fromValue;
        return this;
    }
    /**
     * set the original measurement in originalMea for later to use
     * @param originalMeasure it getting the orignal measurement from the main args which the user typed
     * @return return this is logic to set message
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMea = originalMeasure;
        return this;
    }
    /**
     * it print out the result
     * when the original Measurement is KM, it calculate the M and Mile
     * when the original MEasurement is TON, it calculate the G and KG
     * if it doesn't include in there, it prints out the wrong message
     */
    public void convertAndPrintOut(){
        if (originalMea.equals("KM")){
            outputValue1=inputValue* 1000;
            System.out.println(inputValue +" " + originalMea + " is " + outputValue1 + " " + "M" + "!");
            outputValue2=inputValue/1.6;
            System.out.println(inputValue +" " + originalMea + " is " + outputValue2 + " " + "MILE" + "!");
        }
        else if (originalMea.equals("TON")){
            outputValue1=inputValue * 1000;
            System.out.println(inputValue +" " + originalMea + " is " + outputValue1 + " " + "KG" + "!");
            outputValue2=inputValue * 1000000;
            System.out.println(inputValue +" " + originalMea + " is " + outputValue2  + " " + "G" + "!");
        }
        else {
            System.out.println("AllConventer cannot support the measure!");
        }
    }
}
