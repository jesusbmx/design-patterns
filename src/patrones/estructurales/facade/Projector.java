package patrones.estructurales.facade;

/**
 * 1. Clases del Subsistema - Componentes individuales del sistema de cine en casa.
 * 
 * @author jesus
 */
class Projector {
    void on() { System.out.println("Projector on"); }
    void off() { System.out.println("Projector off"); }
    void setInput(DvdPlayer dvd) { System.out.println("Projector input set to DVD Player"); }
}