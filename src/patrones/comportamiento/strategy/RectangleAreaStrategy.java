package patrones.comportamiento.strategy;

/**
 * 2. Concrete Strategies - Implementaciones específicas de la estrategia de 
 * cálculo del área para diferentes figuras geométricas.
 * 
 * @author Jesus
 */
public class RectangleAreaStrategy implements AreaStrategy {
    private double width;
    private double height;

    public RectangleAreaStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}