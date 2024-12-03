class Mp3Player {
    public void playMp3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

// Target interface
interface AudioPlayer {
    void playAudio(String fileName);
}

// Adapter class
class AudioPlayerAdapter implements AudioPlayer {
    private Mp3Player mp3Player;

    public AudioPlayerAdapter(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void playAudio(String fileName) {
        mp3Player.playMp3(fileName); // Adapting the method
    }
}

// Client code
public class AdapterPatternExample {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        AudioPlayer player = new AudioPlayerAdapter(mp3Player);

        // Client calls the expected method
        player.playAudio("song.mp3");
    }
}
