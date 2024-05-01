package patrones.estructurales.flyweight;

/**
 * 2. ConcreteFlyweight - Implementa la interfaz y almacena el estado intrínseco común.
 * 
 * @author jesus
 */
public class Soldier implements SoldierFlyweight {
    private final String unit;  // Estado intrínseco
    private final String weapon;  // Estado intrínseco

    public Soldier(String unit, String weapon) {
        this.unit = unit;
        this.weapon = weapon;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving " + unit + " soldier to (" + x + ", " + y + ") with " + weapon);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + unit + " soldier with " + weapon);
    }
}
