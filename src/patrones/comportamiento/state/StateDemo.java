package patrones.comportamiento.state;

/**
 * El patrón de diseño State permite a un objeto modificar su comportamiento 
 * cuando su estado interno cambia, pareciendo como si cambiara su clase. 
 * 
 * Este patrón es muy útil para implementar máquinas de estados o cuando el 
 * comportamiento de un objeto depende de su estado interno de manera compleja.
 * 
 * Componentes del patrón State:
 * 1. Context (Contexto): Mantiene una referencia al estado actual y delega las solicitudes de estado a este objeto.
 * 2. State (Estado): Interfaz o clase abstracta que define los métodos que deben implementar todos los estados concretos.
 * 3. ConcreteStates (Estados Concretos): Clases que implementan la interfaz de Estado, representando los diferentes estados en los que puede estar el contexto.
 * 
 * @author jesus
 */
public class StateDemo {
 
    public static void main(String[] args) {
        AlertStateContext context = new AlertStateContext(new Sound());
        context.alert();
        context.alert();
        context.setState(new Vibration());
        context.alert();
        context.alert();
        context.setState(new Silent());
        context.alert();
        context.alert();
    }
}
