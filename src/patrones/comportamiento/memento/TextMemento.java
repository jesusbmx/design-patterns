package patrones.comportamiento.memento;

/**
 * 1. Memento Class - Clase que almacena el estado del Originator.
 * 
 * @author jesus
 */
public class TextMemento {
    private final String state;

    public TextMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

