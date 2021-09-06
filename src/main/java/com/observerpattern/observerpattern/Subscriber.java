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
public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();
    
    public Subscriber(String name)
    {
        super();
        this.name=name;
    }
    
    @Override
    public void update(){
        System.out.println("\nHey " + name + ", Video Uploaded: " + channel.title);
    }
    
    @Override
    public void subscribeChannel(Channel ch)
    {
    channel = ch;
    }
}
