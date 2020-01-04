package de.hft.ip1.pong;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import static de.hft.ip1.pong.Application.ROOTFRAME;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static de.hft.ip1.pong.Application.PONG;

public class InGame {

	public InGame() {
		
		ROOTFRAME.setSize(800, 600);
		ROOTFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ROOTFRAME.setLayout(null);
		ROOTFRAME.setResizable(false);
		ROOTFRAME.setVisible(true);
		ROOTFRAME.setLocationRelativeTo(null);
		ROOTFRAME.addKeyListener(new KeyHandler());
		ROOTFRAME.requestFocus();
		
		PlayFieldPanel lbldraw = new PlayFieldPanel();
		lbldraw.setBounds(0,0, ROOTFRAME.getWidth(), ROOTFRAME.getWidth());
		lbldraw.setVisible(true);
		ROOTFRAME.add(lbldraw);
		
	}
	
}

