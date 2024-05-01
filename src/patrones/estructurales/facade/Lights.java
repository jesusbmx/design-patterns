package patrones.estructurales.facade;

/**
 * 1. Clases del Subsistema - Componentes individuales del sistema de cine en casa.
 * 
 * @author jesus
 */
class Lights {
    void dim(int level) { System.out.println("Lights dimming to " + level + "%"); }
}