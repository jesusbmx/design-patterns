package patrones.comportamiento.observer;

/**
 * 1. Observer Interface - Define la interfaz para recibir actualizaciones del sujeto.
 * 
 * @author jesus
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
