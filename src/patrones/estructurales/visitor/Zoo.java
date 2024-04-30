package patrones.estructurales.visitor;

/**
 * El patrón de diseño Visitor permite realizar operaciones sobre los elementos 
 * de una estructura de objetos sin cambiar las clases de los elementos sobre 
 * los que opera. Esto es útil para separar algoritmos de las estructuras de 
 * datos que utilizan.
 * 
 * En este ejemplo, imagina que tenemos diferentes tipos de animales en un 
 * zoológico, y queremos realizar diferentes acciones con ellos,
 * como alimentarlos o hacer un chequeo médico, sin modificar las clases de los
 * animales.
 * 
 * @author Jesus
 */
public class Zoo {
    
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal elephant = new Elephant();

        AnimalVisitor feedingVisitor = new FeedingVisitor();
        AnimalVisitor checkupVisitor = new CheckupVisitor();

        lion.accept(feedingVisitor);
        tiger.accept(feedingVisitor);
        elephant.accept(feedingVisitor);

        lion.accept(checkupVisitor);
        tiger.accept(checkupVisitor);
        elephant.accept(checkupVisitor);
    }
}
