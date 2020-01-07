package de.hft.ip1.pong;

import javax.swing.JFrame;
import java.awt.Dimension;
import static de.hft.ip1.pong.Application.ROOTFRAME;

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
		lbldraw.setBounds(0, 0, playFieldSize.width, playFieldSize.height);
		lbldraw.setVisible(true);
		ROOTFRAME.add(lbldraw);

		new Player();
		new Opponent();
		new PuckMovement();
		new PuckCollision();
	}

	public static void stoppen() {
		PuckCollision.collision.cancel();
		PuckMovement.move.cancel();
		Player.move.cancel();
	}
}
