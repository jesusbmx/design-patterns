package patrones.estructurales.bridge;

/**
 * El patrón de diseño Bridge es útil para separar una abstracción de su implementación, 
 * de modo que ambos puedan variar independientemente sin afectarse entre sí. 
 * Esto ayuda a desacoplar una interfaz de su implementación y permite que ambas 
 * evolucionen sin tener una dependencia directa.
 * 
 * En este ejemplo se muestra un escenario en el que deseamos abstraer la forma 
 * en que se dibujan diferentes figuras geométricas en diferentes dispositivos
 * de salida como pantalla o impresora.
 * 
 * @author Jesus
 */
public class BridgePatternExample {
    
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI1());
        shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI2());

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
