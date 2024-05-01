package patrones.comportamiento.state;

/**
 * 3. Context Class - Mantiene una instancia de AlertState que define el estado actual.
 * 
 * @author jesus
 */
public class AlertStateContext {

    private AlertState currentState;

    public AlertStateContext(AlertState currentState) {
        this.currentState = currentState;
    }
    
    public void setState(AlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert(this);
    }
}