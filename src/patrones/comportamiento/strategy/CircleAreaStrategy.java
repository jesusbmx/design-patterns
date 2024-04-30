package patrones.comportamiento.strategy;

/**
 * 2. Concrete Strategies - Implementaciones específicas de la estrategia de 
 * cálculo del área para diferentes figuras geométricas.
 * 
 * @author Jesus
 */
public class CircleAreaStrategy implements AreaStrategy {
    private double radius;

    public CircleAreaStrategy(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}