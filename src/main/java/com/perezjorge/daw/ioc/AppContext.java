package com.perezjorge.daw.ioc;

import com.perezjorge.daw.di.car.Car;
import com.perezjorge.daw.di.car.Engine;
import com.perezjorge.daw.di.notification.EmailSender;
import com.perezjorge.daw.di.notification.NotificationService;
import com.perezjorge.daw.di.notification.Notifier;
import com.perezjorge.daw.di.notification.SmsSender;

/**
 * Contenedor IoC mínimo (versión muy simplificada de lo que hace Spring).
 * Es el responsable de crear objetos e inyectarles sus dependencias.
 */

public class AppContext {

    public Car createCar(String engineType) {
        Engine engine = EngineFactory.create(engineType);
        return new Car(engine); // DI: inyectamos el motor
    }

    public NotificationService createEmailNotificationService() {
        Notifier notifier = new EmailSender();
        return new NotificationService(notifier); // DI: inyectamos el notificador
    }

    
    public NotificationService createSmsNotificationService() {
        Notifier notifier = new SmsSender();
        return new NotificationService(notifier); // DI: inyectamos el notificador
    }
}
