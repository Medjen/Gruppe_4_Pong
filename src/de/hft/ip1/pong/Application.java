package de.hft.ip1.pong;

import javax.swing.JFrame;

public class Application {
	protected static final JFrame ROOTFRAME = new JFrame("Pong");
	protected static final Pong PONG = new Pong(800,800);
	public static void main(String[] args) {
		
		//Pong pong = new Pong(800,800);
		new InGame();
		new Player();
		new Opponent();
		new PuckMovement();
		new PuckCollision();
	}

}
