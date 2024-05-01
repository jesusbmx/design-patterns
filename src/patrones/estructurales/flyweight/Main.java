package patrones.estructurales.flyweight;

/**
 *
 * El patrón de diseño Flyweight se utiliza para minimizar el uso de memoria o 
 * los costos computacionales cuando una gran cantidad de objetos comparte el 
 * mismo estado inmutable. Este patrón es especialmente útil cuando se puede 
 * extrapolar un gran número de propiedades compartidas entre muchos objetos, 
 * dejando relativamente pocos datos para ser almacenados de manera única por cada objeto.
 * 
 * Contexto del ejemplo:
 * Imaginemos que estamos desarrollando un juego de guerra donde muchos soldados 
 * son desplegados en un campo de batalla. Cada soldado tiene características
 * comunes como la apariencia, el rango y el tipo de armamento, pero cada uno tiene 
 * un estado único como su salud y posición.
 * 
 * Componentes del patrón Flyweight:
 * 1. Flyweight: La interfaz que declara métodos que los flyweights pueden recibir y usar en datos extrínsecos.
 * 2. ConcreteFlyweight: Implementa la interfaz Flyweight y almacena el estado intrínseco que es compartido.
 * 3. Flyweight Factory: Crea y gestiona los objetos flyweight y asegura que los flyweights se comparten correctamente.
 * 4. Client: Utiliza la fábrica para obtener instancias de Flyweight y pasa el estado extrínseco a los métodos del flyweight.
 * 
 * @author jesus
 */
public class Main {
    
    public static void main(String[] args) {
        SoldierFlyweight soldier1 = SoldierFactory.getSoldier("Infantry", "Rifle");
        soldier1.move(10, 10);
        soldier1.display();

        SoldierFlyweight soldier2 = SoldierFactory.getSoldier("Infantry", "Rifle");
        soldier2.move(20, 20);
        soldier2.display();

        System.out.println("Soldier 1 and Soldier 2 are the same instance: " + (soldier1 == soldier2));
    }
}

