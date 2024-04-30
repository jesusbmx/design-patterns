package patrones.comportamiento.command;

/**
 * 1. Command Interface - Define la acción que se puede ejecutar.
 * 
 * @author Jesus
 */
public interface Command {
    void execute();
    void undo();
}
