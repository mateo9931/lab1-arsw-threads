/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author MateoQuintero-BrayanJimenez
 */
public class CountThread extends Thread {
        public int numA, numB;

        public CountThread (int a, int b){
            numA = a;
            numB = b;
        }
        @Override
        public  void run(){
            for (int i=numA; i<numB; i++) {
                System.out.println(i);
            }
        }
}