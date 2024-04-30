package patrones.estructurales.adapter;

/**
 * 3. Adapter Class - Implementa la interfaz del cliente y traduce las llamadas 
 * a una interfaz compatible con uno de los adaptados.
 * 
 * @author Jesus
 */
public class MediaAdapter implements MediaPlayer {
    Mp3Player mp3Player = new Mp3Player();
    VlcPlayer vlcPlayer = new VlcPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            mp3Player.playMp3(fileName);
        } else if(audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
