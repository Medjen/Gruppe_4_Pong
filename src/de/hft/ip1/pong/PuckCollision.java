package de.hft.ip1.pong;

import static de.hft.ip1.pong.InGame.PONG;
import static de.hft.ip1.pong.Application.ROOTFRAME;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PuckCollision {
	static Timer collision;

	public PuckCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (PONG.getPuckY() + 50 >= ROOTFRAME.getHeight()) {
					PONG.setPuckDirY(-1);
				}

				if (PONG.getPuckY() <= 0) {
					PONG.setPuckDirY(1);
				}

				if (PONG.getPuckX() + 20 >= ROOTFRAME.getWidth()) {

					PONG.setPuckX(ROOTFRAME.getWidth() / 2 - 10);
					PONG.setPuckY(ROOTFRAME.getHeight() / 2 - 10);

					PONG.setPuckDirX(-1);
					PONG.addPlayerPoints(1);
					if (PONG.getPlayerPoints() >= PONG.getOpponentPoints() + 2) {
						PONG.addPoints(2000);
						Aftergame();
					}
					PONG.setPuckSpeed(1.0);

				}

				if (PONG.getPuckX() <= 0) {

					PONG.setPuckX(ROOTFRAME.getWidth() / 2 - 10);
					PONG.setPuckY(ROOTFRAME.getHeight() / 2 - 10);

					PONG.setPuckDirX(-1);
					PONG.addOpponentPoints(1);

					if (PONG.getOpponentPoints() >= PONG.getPlayerPoints() + 2) {
						Aftergame();
					}
					PONG.setPuckSpeed(1.0);
				}

				if (PONG.getPuckX() < PONG.getPlayerX() + 25 && PONG.getPuckX() > PONG.getPlayerX()
						&& PONG.getPuckY() - 20 < PONG.getPlayerY() + 150 && PONG.getPuckY() > PONG.getPlayerY()) {
					PONG.setPuckDirX(1);
			
					PONG.addPuckSpeed(0.02);
					PONG.addPoints((int)(20*PONG.getPuckSpeed()));
					new Musik("src/music/pucksound.wav");
				}

				if (PONG.getPuckX() < PONG.getOpponentX() && PONG.getPuckX() > PONG.getOpponentX() - 20
						&& PONG.getPuckY() - 20 < PONG.getOpponentY() + 150 && PONG.getPuckY() > PONG.getOpponentY()) {
					PONG.setPuckDirX(-1);
			
					PONG.addPuckSpeed(0.02);
					new Musik("src/music/pucksound.wav");

				}

			}

		}, 0, 4);
	}

	public void Aftergame() {

		InGame.Stoppen();
		String name = JOptionPane.showInputDialog(ROOTFRAME, "Du hast " +PONG.getPoints() +" Punkte erreicht. \n\nName:", "Highscore",
				JOptionPane.INFORMATION_MESSAGE);

		if (name != null) {
			if (name.length() == 0) {
				JOptionPane.showMessageDialog(ROOTFRAME, "Bitte geben sie Name ein");
				Aftergame();
				return;
			} else {
				new AfterGame(name, PONG.getPoints());
			}

			HighScore highScore = new HighScore();
			JTable table = new JTable(highScore);
			table.setDefaultEditor(Object.class, null);
			table.getTableHeader().setReorderingAllowed(false);
			JOptionPane.showConfirmDialog(null, new JScrollPane(table), "Highscores", JOptionPane.CLOSED_OPTION,
					JOptionPane.PLAIN_MESSAGE);

		}

		ROOTFRAME.getContentPane().removeAll();
		new MainMenu();
	}

}
