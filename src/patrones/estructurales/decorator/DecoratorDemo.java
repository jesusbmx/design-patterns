package patrones.estructurales.decorator;

/**
 * El patrón de diseño Decorator permite añadir funcionalidades adicionales a objetos 
 * específicos de manera dinámica sin alterar su estructura. Este patrón es útil cuando 
 * se necesita extender las capacidades de clases mediante la adición de nuevas funcionalidades,
 * de manera que sea posible combinar y reutilizar estas capacidades de forma flexible.
 * 
 * Vamos a ver un ejemplo práctico de cómo se puede aplicar el patrón Decorator en Java 
 * para implementar un sistema de bebidas en el que se pueden añadir diferentes 
 * ingredientes a una bebida base.
 * @author Jesus
 */
public class DecoratorDemo {
    
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage mochaCoffee = new Mocha(beverage);
        System.out.println(mochaCoffee.getDescription() + " $" + mochaCoffee.cost());

        Beverage milkMochaCoffee = new Milk(mochaCoffee);
        System.out.println(milkMochaCoffee.getDescription() + " $" + milkMochaCoffee.cost());
    }
}
