package de.hft.ip1.pong;

import java.util.Timer;
import java.util.TimerTask;
import static de.hft.ip1.pong.Application.ROOTFRAME;
import static de.hft.ip1.pong.InGame.PONG;
public class Opponent {
	private Timer move;
	public Opponent() {
	
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if(PONG.getPuckX() >= ROOTFRAME.getWidth() /2 -10){
				
				if(PONG.getPuckY() == PONG.getOpponentY()){
					
				}else if (PONG.getPuckY() > PONG.getOpponentY()+ 75) {
					
					if (PONG.getOpponentY() <= ROOTFRAME.getHeight() - 200) {
						PONG.addOpponentY(2);
					}
					
				

				} else if (PONG.getPuckY() < PONG.getOpponentY() + 75) {
					
					if (PONG.getOpponentY() >= 20) {
						PONG.addOpponentY(-2);
					}

				} 
				}

			}
		}, 0, 6);
	}
}
