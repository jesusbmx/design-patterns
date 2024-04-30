package patrones.comportamiento.strategy;

/**
 * 3. Context - Mantiene una referencia a la estrategia y delega la tarea de calcular el área.
 * 
 * @author Jesus
 */
public class Shape {
    private AreaStrategy strategy;

    public Shape(AreaStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea() {
        return strategy.calculateArea();
    }

    public void setStrategy(AreaStrategy strategy) {
        this.strategy = strategy;
    }
}
