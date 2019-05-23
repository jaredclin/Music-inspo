import java.io.*;
import javax.sound.sampled.*;

public class test {
  public static void main (String [] args) {
    try {
        File yourFile = new File ("testtt.wav");
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        Clip clip;

        stream = AudioSystem.getAudioInputStream(yourFile);
        format = stream.getFormat();
        info = new DataLine.Info(Clip.class, format);
        clip = (Clip) AudioSystem.getLine(info);
        clip.open(stream);
        clip.start();
        Thread.sleep(1000);
    }
    catch (Exception e) {
        //whatevers
    }
  }
}
