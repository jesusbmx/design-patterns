package patrones.comportamiento.command;

/**
 * 2. ConcreteCommand Classes - Implementaciones específicas de comandos.
 * 
 * @author Jesus
 */
public class DeleteCommand implements Command {
    private TextEditor receiver;
    private String removedText;

    public DeleteCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.removedText = receiver.delete();
    }

    @Override
    public void undo() {
        receiver.addText(removedText);
    }
}