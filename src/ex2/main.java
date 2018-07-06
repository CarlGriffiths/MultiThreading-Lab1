/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author carl
 */
public class main {
    
    public static void main(String[] args) {
        int [] values = {55,1,46,28};
        
        MinDataSet set1 = new MinDataSet(values);
        
        Thread t1 = new Thread(set1);
        
        t1.run();
        
        try {
            t1.join();
        } catch (Exception e) {
        }
        
        
        System.out.println("The smallest value is: " + set1.getMin());
    }
    
}
