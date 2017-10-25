import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Papagei extends Tier implements LineListener {

    String name = "Unknown";
    boolean playCompleted;

    public void sing() {

        File audioFile = new File("Adele.wav");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioClip.start();


            while (!playCompleted) {
                // wait for the playback completes
                System.out.println("Type 'Stop' to stop the music!");
                Scanner input = new Scanner(System.in);
                String t = input.nextLine();
                if (t.equalsIgnoreCase("stop")) {
                    playCompleted = true;
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

            }

            audioClip.close();
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }

        System.out.println("LOLOLOLOLOLOLOLOLOLOLOL!!!");
    }

    public void nameMehrmalsSagen(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hallo du, " + name + "!");
        }
    }

    public void namenBeibringen(String name) {
        this.name = name;
    }

    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();

        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");

        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            System.out.println("Playback completed.");
        }

    }
}
