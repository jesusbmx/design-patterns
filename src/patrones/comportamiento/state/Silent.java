package patrones.comportamiento.state;

/**
 * 2. Concrete States - Implementaciones específicas de cada estado.
 * 
 * @author jesus
 */
public class Silent implements AlertState {
    
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Silencio...Pantalla Iluminada...");
    }
}