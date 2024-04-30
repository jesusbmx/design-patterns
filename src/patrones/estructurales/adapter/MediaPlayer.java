package patrones.estructurales.adapter;

/**
 * 1. Target Interface - Esta es la interfaz que espera el cliente.
 * 
 * @author Jesus
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
