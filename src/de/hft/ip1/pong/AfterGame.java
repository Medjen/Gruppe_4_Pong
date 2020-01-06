package de.hft.ip1.pong;

import static de.hft.ip1.pong.Application.BASEFOLDER;
import static de.hft.ip1.pong.Application.ROOTFRAME;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AfterGame {
	
	private JTable table;

	private String name;

	public AfterGame(int points) {
		name = JOptionPane.showInputDialog(ROOTFRAME, "Du hast " + points + " Punkte erreicht. \n\nName:",  "Highscore", 
		        JOptionPane.INFORMATION_MESSAGE);
		if (name != null) {
			if (!name.contains(";")) {
				try (FileWriter fw = new FileWriter(BASEFOLDER + "/highscores.txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out = new PrintWriter(bw)) {
					out.println(name + ";" + points);
				} catch (IOException e) {
					e.printStackTrace();
				}

				HighScore highScore = new HighScore();
				table = new JTable(highScore);
				table.setDefaultEditor(Object.class, null);
				table.getTableHeader().setReorderingAllowed(false);
				JOptionPane.showConfirmDialog(null, new JScrollPane(table), "Highscores", JOptionPane.CLOSED_OPTION,
						JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
}
