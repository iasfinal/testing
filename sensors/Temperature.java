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
public interface Temperature {
    
    public void setTemperatureValue(double value);
    public  double getTemperatureValue();
    public double getMinimumTemparatureValue();
    public void setMinimumTemperatureValue(double Minimum_Value);
    
}
