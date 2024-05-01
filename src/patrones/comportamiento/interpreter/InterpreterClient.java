package patrones.comportamiento.interpreter;

/**
 * El patrón de diseño Interpreter proporciona una manera de evaluar la gramática 
 * o la expresión de un lenguaje particular, utilizado principalmente para tareas 
 * de procesamiento de lenguajes de programación, scripting o lenguajes de consulta. 
 * 
 * Este patrón es útil cuando hay un lenguaje que necesita ser interpretado y ejecutado 
 * dentro de otro programa.
 * 
 * Contexto del ejemplo:
 * Consideremos un ejemplo simple donde se interpreta y evalúa una expresión aritmética 
 * compuesta por sumas y restas.
 * 
 * Componentes del patrón Interpreter:
 * 1. Expression (Expresión): Una interfaz que declara una operación interpret que todos los nodos (terminales y no terminales) en el árbol de sintaxis deben implementar.
 * 2. TerminalExpression: Implementa la interfaz Expression y representa hojas en el árbol de sintaxis que no tienen hijos.
 * 3. NonterminalExpression: Uno o varios objetos Expression como propiedades y define operaciones entre ellos.
 * 
 * @author jesus
 */
public class InterpreterClient {
    
    public static void main(String[] args) {
        // Representa la expresión "(7 + 3) - 2"
        Expression expression = new Minus(
                new Plus(new Number(7), new Number(3)), 
                new Number(2)
        );

        System.out.println("(7 + 3) - 2 = " + expression.interpret());
    }
}
