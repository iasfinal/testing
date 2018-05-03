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
public class FeedOxygenSensoryInput {
    
     
    public static void main(String[] args) {
        
        try{
            Scanner sc=new Scanner(System.in);
            OgyOxygenSensorClass ogyOxygenSensorClass=new OgyOxygenSensorClass();
            while(true){
                
                double value=sc.nextDouble();
                ogyOxygenSensorClass.setOxygenLevelInBlood(value);
                Thread.sleep(2000);
            }
        }catch(Exception e){
            
        }
    }
    
}
