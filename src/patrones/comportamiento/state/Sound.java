package patrones.comportamiento.state;

/**
 * 2. Concrete States - Implementaciones específicas de cada estado.
 * 
 * @author jesus
 */
public class Sound implements AlertState {
    
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Ring...Ring...");

    }
}