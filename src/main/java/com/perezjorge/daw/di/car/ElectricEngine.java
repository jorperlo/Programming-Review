package com.perezjorge.daw.di.car;

/**
 * Implementación de un motor eléctrico.
 */

public class ElectricEngine implements Engine {

    @Override 
    public void start() {
        System.out.println("...silence... Electric engine started.");
    }

}