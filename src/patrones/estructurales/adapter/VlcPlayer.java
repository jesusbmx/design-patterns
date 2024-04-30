package patrones.estructurales.adapter;

/**
 * 2. Adaptee - La clase existente que tienen funcionalidades compatibles pero interfaces diferentes.
 * @author Jesus
 */
public class VlcPlayer {
    
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}