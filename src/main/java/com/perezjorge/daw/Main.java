package com.perezjorge.daw;
import com.perezjorge.daw.di.car.Car;
import com.perezjorge.daw.di.car.ElectricEngine;
import com.perezjorge.daw.di.car.GasolineEngine;
import com.perezjorge.daw.di.notification.EmailSender;
import com.perezjorge.daw.di.notification.NotificationService;
import com.perezjorge.daw.di.notification.SmsSender;

/**
 * Punto de entrada del proyecto.
 * Creamos los objetos a mano para ver el ejemplo de DI.
 */

public class Main {

    public static void main(String[] args) {

        // Ejemplo del coche

        Car gasolineCar = new Car(new GasolineEngine());
        gasolineCar.start();

        Car electricCar = new Car(new ElectricEngine());
        electricCar.start();

        // Ejemplo de notificaciones

        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.notifyUser("Welcome!");

         NotificationService smsService = new NotificationService(new SmsSender());
        smsService.notifyUser("Your code is 1234");
    }
}
