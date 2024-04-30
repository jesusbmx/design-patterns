package patrones.estructurales.adapter;

/**
 * 2. Adaptee - La clase existente que tienen funcionalidades compatibles pero interfaces diferentes.
 * @author Jesus
 */
public class Mp3Player {
    
    public void playMp3(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}
