package com.perezjorge.daw.di.car;

/**
 * Abstracción para cualquier tipo de motor.
 * Car depende de esta interfaz, no de una implementación concreta.
 */

public interface Engine {

    void start();
    
}
