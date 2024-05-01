package patrones.comportamiento.memento;

/**
 * 2. Originator Class - Clase que crea un memento conteniendo una instantánea 
 * de su estado actual y puede usar el memento para restaurar su estado.
 * 
 * @author jesus
 */
public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void addText(String newText) {
        text += newText;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        text = memento.getState();
    }
}
