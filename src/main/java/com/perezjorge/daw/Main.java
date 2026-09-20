package com.perezjorge.daw;
import com.perezjorge.daw.di.car.Car;
import com.perezjorge.daw.di.notification.NotificationService;
import com.perezjorge.daw.ioc.AppContext;

/**
 * Punto de entrada del proyecto.
 *  Main ya no decide cómo se construyen las cosas, solo pide lo que necesita.
 */

public class Main {

    public static void main(String[] args) {

        // IoC: una entidad externa (AppContext) crea y cablea todo

        AppContext context = new AppContext();

        // Ejemplo del coche

        Car gasolineCar = context.createCar("gasoline");
        gasolineCar.start();

        Car electricCar = context.createCar("electric");
        electricCar.start();

        // Ejemplo de notificaciones

         NotificationService emailService = context.createEmailNotificationService();
        emailService.notifyUser("Welcome for email!");

        NotificationService smService = context.createSmsNotificationService();
        smService.notifyUser("Welcome for SMS!");
    }
}
