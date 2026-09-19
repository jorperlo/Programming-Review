package com.perezjorge.daw.di.car;

/**
 * Implementación de un motor de gasolina.
 */

public class GasolineEngine implements Engine {

    @Override 
    public void start() {
        System.out.println("Vroom vroom! Gasoline engine started.");
    }
}

