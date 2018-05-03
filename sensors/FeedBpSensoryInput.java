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
public class FeedBpSensoryInput {
    
    public static void main(String[] args) {
        MaxiBpMonitorClass maxiBpMonitorClass=new MaxiBpMonitorClass();
        try{
            Scanner sc=new Scanner(System.in);
            while(true){
                double value=sc.nextDouble();
                maxiBpMonitorClass.setBpReading(value);
                Thread.sleep(2000);
            }
        }catch(Exception e){
            
        }
    }
}
