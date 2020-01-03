package de.hft.ip1.pong;

import java.util.Timer;
import java.util.TimerTask;
import static de.hft.ip1.pong.Application.PONG;
public class PuckMovement {
Timer move;
	public PuckMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				PONG.setPuckX(PONG.getPuckDirX());
				PONG.setPuckY(PONG.getPuckDirY());
				
				
			}
		}, 0, 4);
	}

}
