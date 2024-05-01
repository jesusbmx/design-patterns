package patrones.comportamiento.mediator;

/**
 * El patrón de diseño Mediator facilita la comunicación entre objetos al 
 * centralizar las interacciones complejas entre ellos en un mediador. 
 * 
 * Esto reduce las dependencias directas entre los objetos, lo que disminuye el 
 * acoplamiento y facilita la gestión de las interacciones.
 * 
 * Componentes del patrón Mediator:
 * 1. Mediator (Mediador): Interfaz que define los métodos utilizados por los componentes para comunicarse con el mediador.
 * 2. ConcreteMediator (Mediador Concreto): Implementación concreta del mediador que coordina la comunicación entre componentes.
 * 3. Colleague (Colega): Clase base o interfaz para los componentes que interactúan con el mediador.
 * 4. ConcreteColleague (Colega Concreto): Clases de componentes que comunican entre sí a través del mediador.
 * 
 * @author Jesus
 */
public class MediatorPatternDemo {
    
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoomMediator();
        User john = new ConcreteUser(mediator, "John");
        User jane = new ConcreteUser(mediator, "Jane");
        User bob = new ConcreteUser(mediator, "Bob");

        mediator.addUser(john);
        mediator.addUser(jane);
        mediator.addUser(bob);

        john.send("Hi there!");
        jane.send("Hey!");
        bob.send("Hello everyone!");
    }
}
