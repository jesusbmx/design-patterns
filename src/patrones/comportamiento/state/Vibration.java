package patrones.comportamiento.state;

/**
 *
 * @author sistemas
 */
public class Vibration implements AlertState {
    
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Vibrando...Vibrando...");
    }
}