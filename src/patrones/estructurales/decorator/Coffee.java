package patrones.estructurales.decorator;

/**
 * 2. ConcreteComponent - Implementación básica de la interfaz Beverage.
 * 
 * @author Jesus
 */
public class Coffee implements Beverage {
    
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
