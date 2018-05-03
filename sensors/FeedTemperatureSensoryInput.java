/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SensoryModule;

import java.util.Scanner;

/**
 *
 * @author mit
 */
public class FeedTemperatureSensoryInput {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        HoneyWellSensorClass honeyWellSensorClass=new HoneyWellSensorClass();
        while(true){
        
            try{
                Double tempValue=sc.nextDouble();
            honeyWellSensorClass.setTemperatureValue(tempValue);
            honeyWellSensorClass.setTemperatureInKelvin(tempValue);
            honeyWellSensorClass.setTemperatureInFarhenheit(tempValue);
            Thread.sleep(2000);
            }
            catch(Exception e){
                
            }
            
        }
        
    }
    
    
    
}
