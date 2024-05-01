package patrones.comportamiento.templatemethod;

/**
 * 2. ConcreteClass - Implementaciones específicas para cada tipo de pago.
 * 
 * @author jesus
 */
public class Paypal extends Payment {

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Paypal...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Paypal...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago a través de los servidores Paypal...");
    }
}