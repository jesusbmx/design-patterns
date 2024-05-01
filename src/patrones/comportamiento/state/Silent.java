package patrones.comportamiento.state;

/**
 *
 * @author sistemas
 */
public class Silent implements AlertState {
    
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Silencio...Pantalla Iluminada...");
    }
}