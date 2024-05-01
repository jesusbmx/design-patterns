package patrones.estructurales.bridge;

/**
 * El patrón de diseño Bridge es útil para separar una abstracción de su implementación, 
 * de modo que ambos puedan variar independientemente sin afectarse entre sí. 
 * 
 * Esto ayuda a desacoplar una interfaz de su implementación y permite que ambas 
 * evolucionen sin tener una dependencia directa.
 * 
 * En este ejemplo se muestra un escenario en el que deseamos abstraer la forma 
 * en que se dibujan diferentes figuras geométricas en diferentes dispositivos
 * de salida como pantalla o impresora.
 * 
 * Componentes del patrón Bridge:
 * 1. Abstraction (Abstracción): Define la interfaz de abstracción y mantiene una referencia a un objeto de tipo Implementor.
 * 2. RefinedAbstraction (Abstracción Refinada): Extiende la interfaz definida por Abstraction.
 * 3. Implementor (Implementador): Define la interfaz para clases de implementación. Esta interfaz no tiene que corresponder exactamente a la interfaz de Abstraction; de hecho, las dos interfaces pueden ser bastante diferentes.
 * 4. ConcreteImplementor (Implementador Concreto): Implementa la interfaz Implementor y define su efecto concreto.
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
