package patrones.comportamiento.command;

/**
 * El patrón de diseño Command encapsula una solicitud como un objeto, 
 * permitiendo así parametrizar clientes con colas, solicitudes y operaciones.
 * 
 * Facilita la implementación de operaciones deshacer (undo) y rehacer (redo), 
 * y también puede ser usado para implementar el registro de transacciones y callbacks.
 * 
 * Componentes del patrón Command:
 * 1. Command: La interfaz que declara un método execute y opcionalmente un método undo para ejecutar y deshacer el comando.
 * 2. ConcreteCommand: Implementaciones concretas de la interfaz Command que encapsulan la acción y sus parámetros.
 * 3. Invoker: Mantiene y llama a los comandos.
 * 4. Receiver: La clase que sabe cómo llevar a cabo las operaciones asociadas con llevar a cabo una solicitud. En este caso, sería el editor de texto.
 * 5. Client: Crea comandos concretos y los asigna a su invocador.
 * 
 * @author Jesus
 */
public class EditorApp {
    
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        manager.executeCommand(new WriteCommand(editor, "Hello, World!"));
        System.out.println(editor.getText());  // Output: Hello, World!

        manager.executeCommand(new WriteCommand(editor, " More text."));
        System.out.println(editor.getText());  // Output: Hello, World! More text.

        manager.undo();
        System.out.println(editor.getText());  // Output: Hello, World!

        manager.executeCommand(new DeleteCommand(editor));
        System.out.println(editor.getText());  // Output: (empty)
    }
}
