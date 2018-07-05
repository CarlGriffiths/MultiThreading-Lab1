/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author carl
 */
public class main {
    
    public static void main(String[] args) {
        
        //times
        double [] times = {5.5, 7.6, 4.6, 2.3};
        
        LUASJourney j = new LUASJourney(times);
        
        Thread t1 = new Thread(j);
        
        t1.start();
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ie) {

        }
        System.out.println("Total Journey Time: " + j.getTotalTime());
    }
    
}
