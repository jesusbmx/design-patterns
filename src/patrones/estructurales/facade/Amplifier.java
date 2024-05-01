package patrones.estructurales.facade;

/**
 * 1. Clases del Subsistema - Componentes individuales del sistema de cine en casa.
 * 
 * @author jesus
 */
class Amplifier {
    void on() { System.out.println("Amplifier on"); }
    void off() { System.out.println("Amplifier off"); }
    void setVolume(int level) { System.out.println("Setting volume to " + level); }
}
