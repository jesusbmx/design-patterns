package patrones.comportamiento.visitor;

/**
 * 4. Clases Concreta del Elemento - Implementan la interfaz Animal.
 * 
 * @author Jesus
 */
public class Tiger implements Animal {
    
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}