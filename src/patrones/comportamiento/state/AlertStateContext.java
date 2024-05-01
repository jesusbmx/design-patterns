package patrones.comportamiento.state;

/**
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