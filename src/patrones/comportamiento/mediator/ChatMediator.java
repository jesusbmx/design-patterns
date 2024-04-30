package patrones.comportamiento.mediator;

/**
 * 1. Mediator Interface - Define cómo los usuarios se comunican a través del chat.
 * 
 * @author Jesus
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
