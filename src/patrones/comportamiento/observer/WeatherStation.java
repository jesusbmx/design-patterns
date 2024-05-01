package patrones.comportamiento.observer;

/**
 * El patrón de diseño Observer se utiliza para crear una relación de suscripción 
 * entre objetos de manera que cuando un objeto cambia su estado, todos sus 
 * dependientes son notificados y actualizados automáticamente. 
 * 
 * Este patrón es muy útil en situaciones donde el estado de un objeto debe ser 
 * monitoreado por uno o más objetos.
 * 
 * Contexto del ejemplo:
 * Supongamos que tenemos un sistema de notificación de clima que informa a varios 
 * dispositivos (observadores) como teléfonos y tablets sobre cambios en el clima, 
 * como cambios de temperatura y presión atmosférica.
 * 
 * Componentes del patrón Observer:
 * 1. Subject (Sujeto): Mantiene una lista de observadores, facilita agregar o eliminar observadores y notifica a estos cuando hay cambios.
 * 2. Observer (Observador): Define una interfaz de actualización que se llama por el Sujeto cuando este cambia de estado.
 * 3. ConcreteSubject (Sujeto Concreto): Almacena estados que deben ser observados y notifica a los observadores cuando cambian.
 * 4. ConcreteObserver (Observador Concreto): Mantiene una referencia a un Sujeto, almacena el estado que debe permanecer consistente con el del sujeto, e implementa la interfaz de actualización del Observador.
 * 
 * @author jesus
 */
public class WeatherStation {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}