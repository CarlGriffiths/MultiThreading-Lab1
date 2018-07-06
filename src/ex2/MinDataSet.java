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
public class MinDataSet extends DataSet implements Runnable {

    private int min = data[0];

    public MinDataSet(int[] data) {
        super(data);
    }

    @Override
    public void run() {
        for (int i = 0; i < data.length; i++) {
            
           if(data[i] < min){
               min = data[i];
           }

        }
    }

    public int getMin() {
        return min;
    }

}
