package patrones.comportamiento.command;

import java.util.Stack;

/**
 * 4. Invoker - Solicita la operación del comando.
 * 
 * @author Jesus
 */
public class CommandManager {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command cmd) {
        cmd.execute();
        history.push(cmd);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command cmd = history.pop();
            cmd.undo();
        }
    }
}
