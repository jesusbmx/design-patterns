package patrones.estructurales.flyweight;

/**
 * 1. Flyweight Interface - Define las operaciones que pueden recibir y utilizar datos extrínsecos.
 * 
 * @author jesus
 */
public interface SoldierFlyweight {
    void move(int x, int y);
    void display();  // Assume display uses internal state
}
