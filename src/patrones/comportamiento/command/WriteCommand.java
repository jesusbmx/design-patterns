package patrones.comportamiento.command;

/**
 * 2. ConcreteCommand Classes - Implementaciones específicas de comandos.
 * 
 * @author Jesus
 */
public class WriteCommand implements Command {
    private TextEditor receiver;
    private String text;

    public WriteCommand(TextEditor receiver, String text) {
        this.receiver = receiver;
        this.text = text;
    }

    @Override
    public void execute() {
        receiver.addText(text);
    }

    @Override
    public void undo() {
        receiver.removeText(text.length());
    }
}