package patrones.estructurales.decorator;

/**
 * 3. Decorator - Clase abstracta para los ingredientes adicionales.
 * @author Jesus
 */
public abstract class IngredientDecorator implements Beverage {
    protected Beverage beverage;

    public IngredientDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
