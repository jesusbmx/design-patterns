package patrones.estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Flyweight Factory - Crea y gestiona los flyweights, asegurando que se comparten.
 * 
 * @author jesus
 */
public class SoldierFactory {
    private static final Map<String, SoldierFlyweight> soldiers = new HashMap<>();

    public static SoldierFlyweight getSoldier(String unit, String weapon) {
        String key = unit + ":" + weapon;
        if (!soldiers.containsKey(key)) {
            soldiers.put(key, new Soldier(unit, weapon));
            System.out.println("Creating soldier of unit " + unit + " with weapon " + weapon);
        }
        return soldiers.get(key);
    }
}
