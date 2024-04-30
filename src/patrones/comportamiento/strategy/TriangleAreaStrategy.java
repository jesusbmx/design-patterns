package patrones.comportamiento.strategy;

/**
 * 2. Concrete Strategies - Implementaciones específicas de la estrategia de 
 * cálculo del área para diferentes figuras geométricas.
 * 
 * @author Jesus
 */
public class TriangleAreaStrategy implements AreaStrategy {
    private double base;
    private double height;

    public TriangleAreaStrategy(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}