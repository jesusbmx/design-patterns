package patrones.comportamiento.mediator;

/**
 *El patrón de diseño Mediator facilita la comunicación entre objetos al 
 * centralizar las interacciones complejas entre ellos en un mediador. 
 * 
 * Esto reduce las dependencias directas entre los objetos, lo que disminuye el 
 * acoplamiento y facilita la gestión de las interacciones.
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
