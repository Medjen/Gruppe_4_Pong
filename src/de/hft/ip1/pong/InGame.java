package de.hft.ip1.pong;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

import static de.hft.ip1.pong.Application.ROOTFRAME;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InGame {
	protected static Pong PONG;
	private Dimension playFieldSize;
	
	public InGame(Dimension playFieldSize) {
		this.playFieldSize = playFieldSize;
		PONG = new Pong(playFieldSize);
		init();
	}
	
	public void init() {
		
		ROOTFRAME.getContentPane().removeAll();
		ROOTFRAME.setLocationRelativeTo(null);
		ROOTFRAME.setSize(playFieldSize.width, playFieldSize.height);
		ROOTFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ROOTFRAME.setLayout(null);
		ROOTFRAME.setResizable(false);
		ROOTFRAME.setVisible(true);
		ROOTFRAME.setLocationRelativeTo(null);
		ROOTFRAME.addKeyListener(new KeyHandler());
		ROOTFRAME.requestFocus();
		
		PlayFieldPanel lbldraw = new PlayFieldPanel();
		lbldraw.setBounds(0,0, playFieldSize.width, playFieldSize.height);
		lbldraw.setVisible(true);
		ROOTFRAME.add(lbldraw);
	
		new Player();
		new Opponent();
		new PuckMovement();
		new PuckCollision();
	}
	
}

