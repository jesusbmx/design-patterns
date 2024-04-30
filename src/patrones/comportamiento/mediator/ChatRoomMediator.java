package patrones.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Concrete Mediator - Un servidor de chat que coordina los mensajes entre los usuarios.
 * 
 * @author Jesus
 */
public class ChatRoomMediator implements ChatMediator {
    private List<User> users;

    public ChatRoomMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // El mensaje no se envía al usuario que lo envió
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}