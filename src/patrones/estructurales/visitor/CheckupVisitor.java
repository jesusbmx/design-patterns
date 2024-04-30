package patrones.estructurales.visitor;

/**
 * 2. Clases Concreta de Visitor - Implementaciones específicas de la interfaz AnimalVisitor.
 * 
 * @author Jesus
 */
public class CheckupVisitor implements AnimalVisitor {
    public void visit(Lion lion) {
        System.out.println("Performing a checkup on the lion");
    }

    public void visit(Tiger tiger) {
        System.out.println("Performing a checkup on the tiger");
    }

    public void visit(Elephant elephant) {
        System.out.println("Performing a checkup on the elephant");
    }
}
