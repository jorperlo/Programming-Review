# Repaso: Inversión de Control (IoC) e Inyección de Dependencias (DI)

## ¿Qué es una dependencia?
Una **dependencia** es algo que una clase necesita para funcionar.
Por ejemplo, un `Car` necesita un `Engine`.

## Inversión de Control (IoC)
Principio de diseño por el cual el control de **crear y gestionar objetos**
se delega a una entidad externa (una factoría, un contenedor, un framework...).

- Flujo tradicional: tu código crea y controla sus dependencias.
- Flujo con IoC: una entidad externa las crea y controla por ti.

> "Don't call us, we'll call you." (Hollywood Principle)

## Inyección de Dependencias (DI)
DI es **UNA forma** de conseguir IoC.
En vez de que una clase cree sus dependencias, se las **pasan desde fuera**.

### Tipos de DI
- Inyección por constructor (la preferida)
- Inyección por setter
- Inyección por campo (evitar)

## Diferencia en una línea
- **IoC** = quién tiene el control (una entidad externa).
- **DI** = cómo llega la dependencia (inyectada desde fuera).

## Regla de oro
Si ves `new` dentro de una clase que no sea `Main` o una factoría → 🚩

## Ejemplos en este proyecto
- `Car` + `Engine` (inyección por constructor)
- `NotificationService` + `Notifier` (inyección por constructor)
- `EngineFactory` + `AppContext` (IoC: una entidad externa decide qué crear)

## Estructura del proyecto
- `com.perezjorge.daw.di`   → ejemplos de DI
- `com.perezjorge.daw.ioc`  → ejemplo de IoC (AppContext + EngineFactory)
- `com.perezjorge.daw.Main` → punto de entrada

## Cómo ejecutar
```bash
mvn clean package
java -cp target/classes com.perezjorge.daw.Main