package com.mcuhq.simplebluetooth;

/**
 * Created by Sara Iacoponi on 18/12/17.
 */

public class Message {

    int heartRate;
    int pression;
    int acceleration;

    public Message(int heartRate, int pression, int acceleration){
        this.heartRate = heartRate;
        this.pression = pression;
        this.acceleration = acceleration;
    }
}
