package com.perezjorge.daw.di.notification;

/**
 * Implementación de notificador por email.
 */

public class EmailSender implements Notifier {

    @Override
    public void send(String message) {
    System.out.println("Sending EMAIL: " + message);
    }
    
}
