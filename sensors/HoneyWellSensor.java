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
public interface HoneyWellSensor extends Temperature {
    
    public double getTemperatureInKelvin();
    public double getTemperatureInFarhenheit();
    public void setTemperatureInKelvin(double value);
    public void setTemperatureInFarhenheit(double value);
}
