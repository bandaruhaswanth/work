/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observerpattern.observerpattern;

/**
 *
 * @author Mohit Computers
 */
public class Youtube {
    public static void main(String[] args)
    {
        Channel AviaryBirds = new Channel();
        Subscriber s1 = new Subscriber("Akshay");
        Subscriber s2 = new Subscriber("Vijay");
        Subscriber s3 = new Subscriber("John");
        Subscriber s4 = new Subscriber("Smith");
        Subscriber s5 = new Subscriber("Smith");
        
        AviaryBirds.subscribe(s1);
        AviaryBirds.subscribe(s2);
        AviaryBirds.subscribe(s3);
        AviaryBirds.subscribe(s4);
        AviaryBirds.subscribe(s5);
        
        s1.subscribeChannel(AviaryBirds);
        s2.subscribeChannel(AviaryBirds);
        s3.subscribeChannel(AviaryBirds);
        s4.subscribeChannel(AviaryBirds);
        s5.subscribeChannel(AviaryBirds);
        
        AviaryBirds.upload("New Cocktail video.");
        
        AviaryBirds.unSubscribe(s3);
        
        AviaryBirds.upload("Exotic birds: lovebirds video");
    }
}
