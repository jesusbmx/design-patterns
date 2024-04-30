package patrones.estructurales.decorator;

/**
 * 4. ConcreteDecorator - Clases concretas para cada ingrediente adicional.
 * 
 * @author Jesus
 */
public class Mocha extends IngredientDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
