package com.perezjorge.daw.di.car;

/**
 * Car recibe su Engine desde fuera (inyección por constructor).
 * NO crea el motor él mismo.
 */

public class Car {

    private final Engine engine;
    
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}