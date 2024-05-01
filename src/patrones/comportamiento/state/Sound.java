package patrones.comportamiento.state;

/**
 *
 * @author sistemas
 */
public class Sound implements AlertState {
    
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Ring...Ring...");

    }
}