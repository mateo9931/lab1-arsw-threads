/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author Mateo Quintero-Brayan Jimenez
 */
public class CountThreadsMain {

    public static void main(String a[]){
        CountThread countThread1 = new CountThread(0,99);
        CountThread countThread2 = new CountThread(99,199);
        CountThread countThread3 = new CountThread(200,299);
        countThread1.run();
        countThread2.run();
        countThread3.run();
    }
}

