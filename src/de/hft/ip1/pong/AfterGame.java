package de.hft.ip1.pong;

import static de.hft.ip1.pong.Application.BASEFOLDER;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AfterGame {
	public AfterGame(String name, int points) {
		try (FileWriter fw = new FileWriter(BASEFOLDER + "/highscores.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(name + ";" + points);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
