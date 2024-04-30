package patrones.comportamiento.visitor;

/**
 * 4. Clases Concreta del Elemento - Implementan la interfaz Animal.
 * 
 * @author Jesus
 */
public class Lion implements Animal {
    
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}