package patrones.comportamiento.strategy;

/**
 * El patrón de diseño Strategy permite definir una familia de algoritmos, 
 * encapsular cada uno de ellos como un objeto y hacerlos intercambiables. 
 * Strategy permite que el algoritmo varíe independientemente de los clientes que lo utilizan. 
 * Es muy útil para situaciones donde se necesitan diferentes variantes de un algoritmo en diferentes escenarios.
 * 
 * Este es un ejemplo para calcular el área de diferentes figuras geométricas. 
 * Este enfoque permite cambiar el algoritmo de cálculo del área según la figura sin 
 * alterar el contexto en el que se utilizan estas estrategias.
 * 
 * @author Jesus
 */
public class StrategyExample {
    
    public static void main(String[] args) {
        Shape shape = new Shape(new RectangleAreaStrategy(5, 10));
        System.out.println("Area of Rectangle: " + shape.calculateArea());

        shape.setStrategy(new CircleAreaStrategy(7));
        System.out.println("Area of Circle: " + shape.calculateArea());

        shape.setStrategy(new TriangleAreaStrategy(10, 5));
        System.out.println("Area of Triangle: " + shape.calculateArea());
    }
}
