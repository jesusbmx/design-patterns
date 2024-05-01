package patrones.comportamiento.memento;

import java.util.Stack;

/**
 * 3. Caretaker Class - Clase que guarda y recupera los mementos del Originator sin modificarlos.
 * @author jesus
 */
public class Caretaker {
    private Stack<TextMemento> history = new Stack<>();

    public void saveMemento(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento getMemento() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
