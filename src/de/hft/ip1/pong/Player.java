package de.hft.ip1.pong;

import java.util.Timer;
import java.util.TimerTask;
import static de.hft.ip1.pong.Application.ROOTFRAME;
import static de.hft.ip1.pong.Application.PONG;
public class Player {
private Timer move;
	public Player() {
		move = new Timer();
	
		move.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(PONG.isMoveUp() == true){
					
					if(PONG.getPlayerX() >=20){
						PONG.setPlayerY(-2);
					}
				}else if(PONG.isMoveDown() == true){
					
					if(PONG.getPlayerY() <= ROOTFRAME.getHeight() - 200){
						PONG.setPlayerY(2);
					}
				}
				
			}
			
		}, 0, 6);
	}

}
