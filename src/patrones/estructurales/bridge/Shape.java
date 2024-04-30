package patrones.estructurales.bridge;

/**
 * 3. Abstraction - Define la abstracción con una referencia a un objeto de tipo Implementor.
 * 
 * @author Jesus
 */
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw(); // low-level
    public abstract void resizeByPercentage(double pct); // high-level
}
