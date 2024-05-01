package patrones.comportamiento.state;

/**
 * 2. Concrete States - Implementaciones específicas de cada estado.
 * 
 * @author jesus
 */
public class Vibration implements AlertState {
    
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Vibrando...Vibrando...");
    }
}