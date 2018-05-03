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
public class OgyOxygenSensorClass implements OgyOxygenSensor{

    private double value;
    private double minimumValue;
    @Override
    public void setMinimumOxygenLevel(double value) {
        
        this.minimumValue=value;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getMinimumOxygenLevel() {
        return this.minimumValue; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOxygenLevelInBlood(double value) {
        this.value=value;
        if(minimumValue>value)
            setMinimumOxygenLevel(value);
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getOxygenLevelInBlood() {
       return this.value;//To change body of generated methods, choose Tools | Templates.
    }
    
}
