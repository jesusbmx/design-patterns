package patrones.comportamiento.visitor;

/**
 * 2. Clases Concreta de Visitor - Implementaciones específicas de la interfaz AnimalVisitor.
 * 
 * @author Jesus
 */
public class FeedingVisitor implements AnimalVisitor {
    public void visit(Lion lion) {
        System.out.println("Feed the lion with meat");
    }

    public void visit(Tiger tiger) {
        System.out.println("Feed the tiger with chicken");
    }

    public void visit(Elephant elephant) {
        System.out.println("Feed the elephant with fruits");
    }
}

