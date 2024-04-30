package patrones.estructurales.decorator;

/**
 * 4. ConcreteDecorator - Clases concretas para cada ingrediente adicional.
 * 
 * @author Jesus
 */
public class Milk extends IngredientDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}