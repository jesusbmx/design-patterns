package patrones.comportamiento.templatemethod;

/**
 * El patrón de diseño Template Method define el esqueleto de un algoritmo en una 
 * operación, delegando algunos pasos a las subclases. 
 * 
 * El Template Method permite que las subclases redefinan ciertos pasos de un 
 * algoritmo sin cambiar la estructura del algoritmo.
 * 
 * Componentes del patrón Template Method:
 * 1. AbstractClass: Clase abstracta que define el template method y sus pasos abstractos que las subclases deberán implementar.
 * 2. ConcreteClass: Subclases que implementan los pasos específicos del algoritmo definido en la clase abstracta.
 * 
 * @author jesus
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        Payment payment = new Visa();
        payment.makePayment();

        payment = new Paypal();
        payment.makePayment();
    }
}
