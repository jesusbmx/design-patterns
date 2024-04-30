package patrones.estructurales.bridge;

/**
 * 2. Concrete Implementors - Implementaciones concretas de la interfaz DrawingAPI.
 * 
 * @author Jesus
 */
public class DrawingAPI1 implements DrawingAPI {
    
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }
}
