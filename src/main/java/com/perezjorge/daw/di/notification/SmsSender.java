package com.perezjorge.daw.di.notification;

/**
 * Implementación de notificador por SMS.
 */

public class SmsSender implements Notifier{

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
    
}
