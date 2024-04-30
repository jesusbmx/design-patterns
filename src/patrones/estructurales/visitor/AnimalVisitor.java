package patrones.estructurales.visitor;

/**
 * 1. Interface Visitor - Define una operación para cada tipo de elemento concreto en la estructura de objetos.
 * 
 * @author Jesus
 */
public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Tiger tiger);
    void visit(Elephant elephant);
}
