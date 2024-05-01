package patrones.comportamiento.interpreter;

/**
 * 3. NonterminalExpression - Implementa operadores como suma y resta.
 * 
 * @author jesus
 */
public class Minus implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Minus(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
