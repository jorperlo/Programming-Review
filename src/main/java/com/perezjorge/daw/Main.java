package com.perezjorge.daw;
import com.perezjorge.daw.di.car.Car;
import com.perezjorge.daw.di.car.ElectricEngine;
import com.perezjorge.daw.di.car.GasolineEngine;

/**
 * Punto de entrada del proyecto.
 * De momento creamos los objetos a mano para ver el ejemplo de DI.
 */

public class Main {

    public static void main(String[] args) {

        Car gasolineCar = new Car(new GasolineEngine());
        gasolineCar.start();

        Car electricCar = new Car(new ElectricEngine());
        electricCar.start();
    }
}
