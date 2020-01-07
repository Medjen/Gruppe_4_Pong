package de.hft.ip1.pong;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
	String filepath;
	Clip clip;
	AudioInputStream inputstream;

	public Music(String filepath) {
		this.filepath = filepath;

		try {
			inputstream = AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
		} catch (UnsupportedAudioFileException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			clip.open(inputstream);
		} catch (LineUnavailableException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (filepath.equals("src/music/background2.wav")) {
			clip.loop(clip.LOOP_CONTINUOUSLY);
		}
		clip.start();
	}

}
