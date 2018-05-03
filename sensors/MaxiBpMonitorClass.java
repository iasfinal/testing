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
public class MaxiBpMonitorClass implements MaxiBpMonitor{

    private double highestBp;
    private double lowestBp;
    private double averageBp;
    private double valueBp;
   
    @Override
    public void setHighestBp(double value) {
        this.highestBp=value;
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLowestBp(double value) {
        this.lowestBp=value;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHighestBp() {
        
        return this.highestBp;
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getLowestBp() {
        //To change body of generated methods, choose Tools | Templates.
        return this.lowestBp;
    }

    @Override
    public void setAverageBp(double value) {
        //To change body of generated methods, choose Tools | Templates.
        this.averageBp=value;
    }

    @Override
    public double getAverageBp() {
        return this.averageBp;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBpReading() {
        
        return this.valueBp;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBpReading(double value) {
        
        
        if(highestBp<value){
            setHighestBp(value);
        }
        else {
            if(lowestBp>value)
                setLowestBp(value);
            
        }
        
        setAverageBp((getLowestBp()+getHighestBp())/2);
        
        this.valueBp=value;
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
