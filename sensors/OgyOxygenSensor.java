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
public interface OgyOxygenSensor extends oxygen {
    
    public void setMinimumOxygenLevel(double value);
    public double getMinimumOxygenLevel();
}
