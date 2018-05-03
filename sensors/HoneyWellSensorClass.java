/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SensoryModule;

/**
 *
 * @author mit
 */
public class HoneyWellSensorClass implements HoneyWellSensor{

    private double temperatureValue;
    private double minTemperature;
    private double kelvinTemperature;
    private double farhenheitTemperature;
   

    @Override
    public void setTemperatureValue(double value) {
       //To change body of generated methods, choose Tools | Templates.
    
        if(minTemperature>value)
        {
            setMinimumTemperatureValue(value);
        }
        this.temperatureValue=value;
    }

    @Override
    public double getTemperatureValue() {
     //To change body of generated methods, choose Tools | Templates.
        return this.temperatureValue;
    }

    @Override
    public double getMinimumTemparatureValue() {
         //To change body of generated methods, choose Tools | Templates.
         return minTemperature;
    }

    @Override
    public void setMinimumTemperatureValue(double minimum_Value) {
        
        this.minTemperature=minimum_Value;
        
    }

    @Override
    public double getTemperatureInKelvin() {
        return this.kelvinTemperature;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTemperatureInFarhenheit() {
        return this.farhenheitTemperature; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTemperatureInKelvin(double value) {
        //To change body of generated methods, choose Tools | Templates.
        this.kelvinTemperature=value+273.15;
    }

    @Override
    public void setTemperatureInFarhenheit(double value) {
         //To change body of generated methods, choose Tools | Templates.
         this.farhenheitTemperature=value*(9/5)+32;
    }
    
}
