package com.perezjorge.daw.di.notification;


/**
 * Abstracción para cualquier canal de notificación.
 */

public interface  Notifier {

    void send(String message);
    
}
