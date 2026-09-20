package com.perezjorge.daw.ioc;

import com.perezjorge.daw.di.car.ElectricEngine;
import com.perezjorge.daw.di.car.Engine;
import com.perezjorge.daw.di.car.GasolineEngine;

/**
 * Ejemplo de IoC: una entidad externa decide qué Engine crear.
 * Main ya no necesita conocer las implementaciones concretas.
 */

public class EngineFactory {

    public static Engine create(String type) {
        return switch (type.toLowerCase()) {
            case "gasoline" -> new GasolineEngine();
            case "electric" -> new ElectricEngine();
            default -> throw new IllegalArgumentException("Unknown engine type: " + type);
        };
    }
}
