package de.hft.ip1.pong;

import java.util.Timer;
import java.util.TimerTask;
import static de.hft.ip1.pong.InGame.PONG;

public class PuckMovement {
	Timer move;

	public PuckMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				PONG.addPuckX((PONG.getPuckDirX()*PONG.getPuckSpeed()));
				PONG.addPuckY((PONG.getPuckDirY()*PONG.getPuckSpeed()));

			}
		}, 0, 4);
	}

}
