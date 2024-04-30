package patrones.estructurales.visitor;

/**
 * 4. Clases Concreta del Elemento - Implementan la interfaz Animal.
 * 
 * @author Jesus
 */
public class Elephant implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}