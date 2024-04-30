package patrones.comportamiento.command;

/**
 * 3. Receiver - Realiza las operaciones asociadas con los comandos.
 * 
 * @author Jesus
 */
public class TextEditor {
     private StringBuilder text = new StringBuilder();

    public void addText(String text) {
        this.text.append(text);
    }

    public String delete() {
        String deleted = this.text.toString();
        this.text = new StringBuilder();
        return deleted;
    }

    public void removeText(int length) {
        text.setLength(Math.max(0, text.length() - length));
    }

    public String getText() {
        return text.toString();
    }
}
