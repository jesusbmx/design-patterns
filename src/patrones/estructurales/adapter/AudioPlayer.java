package patrones.estructurales.adapter;

/**
 * 4. Cliente - Usa la interfaz MediaPlayer a través del Adapter.
 * 
 * @author Jesus
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // En el caso de MP3, puede reproducirlo directamente usando la clase Mp3Player
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } 
        // MediaAdapter se encarga de otros formatos
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        } 
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
