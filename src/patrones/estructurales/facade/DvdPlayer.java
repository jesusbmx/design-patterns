package patrones.estructurales.facade;

/**
 * 1. Clases del Subsistema - Componentes individuales del sistema de cine en casa.
 * 
 * @author jesus
 */
class DvdPlayer {
    void on() { System.out.println("DVD Player on"); }
    void off() { System.out.println("DVD Player off"); }
    void play(String movie) { System.out.println("Playing \"" + movie + "\""); }
}