package patrones.estructurales.adapter;

/**
 * El patrón de diseño Adapter permite que interfaces incompatibles trabajen juntas. 
 * 
 * Funciona transformando la interfaz de una clase en otra interfaz que los clientes esperan. 
 * 
 * Es especialmente útil en situaciones donde necesitas integrar clases existentes 
 * con nuevas interfaces.
 * 
 * En este ejemplo en Java utilizando el patrón Adapter. 
 * 
 * Supongamos que tenemos un sistema de reproducción de música, pero queremos 
 * que pueda trabajar tanto con archivos MP3 como con archivos en formato VLC.
 * 
 * @author Jesus
 */
public class MediaPlayerTest {
    
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "beyond_the_horizon.mp3");
        player.play("vlc", "far_far_away.vlc");
        player.play("avi", "mind_me.avi");
    }
}
