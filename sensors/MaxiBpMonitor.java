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
public interface MaxiBpMonitor extends BloodPressure {
    
    public void setHighestBp(double value);
    public void setLowestBp(double value);
    public double getHighestBp();
    public double getLowestBp();
    public void setAverageBp(double value);
    public double getAverageBp();
    
}
