package com.perezjorge.daw.di.notification;

/**
 * El servicio depende de la abstracción Notifier.
 * La implementación concreta se inyecta desde fuera.
 */

public class NotificationService {

    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.send(message);
    }
}
