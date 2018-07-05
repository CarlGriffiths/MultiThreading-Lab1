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
public class LUASJourney extends Journey implements Runnable {

    private double totalTime;

    public LUASJourney(double[] journeydata) {
        super(journeydata);
    }

    @Override
    public void run() {
        for (int i = 0; i < timeInterval.length; i++) {
            totalTime += timeInterval[i];

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                System.out.println("Error " + e);

            }
        }

    }

    public double getTotalTime() {
        return totalTime;
    }

}
