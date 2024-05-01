package patrones.comportamiento.state;

/**
 * 1. State (Estado): Interfaz o clase abstracta que define los métodos que 
 * deben implementar todos los estados concretos.
 * 
 * @author jesus
 */
public interface AlertState {
    
    void alert(AlertStateContext context);
}
