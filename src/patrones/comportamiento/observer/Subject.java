package patrones.comportamiento.observer;

/**
 * 2. Subject Interface - Define las operaciones para adjuntar y desadjuntar observadores.
 * 
 * @author jesus
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
