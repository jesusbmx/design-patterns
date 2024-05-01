package patrones.comportamiento.interpreter;

/**
 * 2. TerminalExpression - Implementa los números en la expresión.
 * 
 * @author jesus
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
