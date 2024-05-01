package patrones.comportamiento.templatemethod;

/**
 * 1. AbstractClass - Define el esqueleto del algoritmo.
 * 
 * @author jesus
 */
public abstract class Payment {
    
    abstract void initialize();
    abstract void startPayment();
    abstract void endPayment();

    public final void makePayment(){
        initialize();
        startPayment();
        endPayment();
    }
}
