package patrones.comportamiento.visitor;

/**
 * 3. Interface Elemento - Define el método accept que los visitantes usarán.
 * 
 * @author Jesus
 */
public interface Animal {
    void accept(AnimalVisitor visitor);
}
