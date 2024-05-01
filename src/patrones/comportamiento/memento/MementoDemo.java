package patrones.comportamiento.memento;

/**
 * El patrón de diseño Memento se utiliza para capturar y almacenar el estado 
 * interno de un objeto sin violar el encapsulamiento, de manera que el objeto 
 * pueda ser restaurado a este estado más tarde. 
 * 
 * Este patrón es útil en situaciones donde se requiere la funcionalidad de 
 * deshacer o donde se necesita guardar estados para realizar recuperaciones.
 * 
 * Contexto del ejemplo:
 * Consideremos un editor de texto simple que permite guardar y deshacer los 
 * cambios realizados en el contenido del texto.
 * 
 * Componentes del patrón Memento:
 * 1. Originator: El objeto cuyo estado interno se desea guardar o restaurar.
 * 2. Memento: Un objeto que almacena el estado interno del originador.
 * 3. Caretaker: Objeto que mantiene la traza de múltiples mementos pero nunca 
 *  opera o examina los contenidos de estos.
 * 
 * @author jesus
 */
public class MementoDemo {
    
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.addText("Hello");
        caretaker.saveMemento(editor.save());

        editor.addText(" World");
        caretaker.saveMemento(editor.save());

        System.out.println("Current Text: " + editor.getText());  // Output: Hello World

        editor.restore(caretaker.getMemento());
        System.out.println("After undo: " + editor.getText());  // Output: Hello

        editor.restore(caretaker.getMemento());
        System.out.println("After another undo: " + editor.getText());  // Output: Hello
    }
}
