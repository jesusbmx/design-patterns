package patrones.comportamiento.command;

/**
 * El patrón de diseño Command encapsula una solicitud como un objeto, 
 * permitiendo así parametrizar clientes con colas, solicitudes y operaciones.
 * 
 * Facilita la implementación de operaciones deshacer (undo) y rehacer (redo), 
 * y también puede ser usado para implementar el registro de transacciones y callbacks.
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

        manager.undo();
        System.out.println(editor.getText());  // Output: (empty)
    }
}
