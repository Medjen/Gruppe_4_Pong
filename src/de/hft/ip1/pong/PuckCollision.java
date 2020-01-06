package de.hft.ip1.pong;

import static de.hft.ip1.pong.InGame.PONG;
import static de.hft.ip1.pong.Application.ROOTFRAME;
import java.util.Timer;
import java.util.TimerTask;
public class PuckCollision {
Timer collision;
	public PuckCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(PONG.getPuckY() +50 >= ROOTFRAME.getHeight()){
					PONG.setPuckDirY(-1);
				}
				
				if(PONG.getPuckY() <= 0){
					PONG.setPuckDirY(1);
				}
				
				if(PONG.getPuckX() +20 >= ROOTFRAME.getWidth()){
					
					PONG.setPuckX(ROOTFRAME.getWidth() /2 -10);
					PONG.setPuckY(ROOTFRAME.getHeight() /2 -10);
					
					PONG.setPuckDirX(-1);
					PONG.addPlayerPoints(1);
					if(PONG.getPlayerPoints()>=PONG.getOpponentPoints()+2) {
						System.out.println("gewonnen");
						new AfterGame(1000);

						
					}
					PONG.setPuckSpeed(1.0);
				}
				
				if(PONG.getPuckX() <= 0){
					
					PONG.setPuckX(ROOTFRAME.getWidth() /2 -10);
					PONG.setPuckY(ROOTFRAME.getHeight() /2 -10);
					
					PONG.setPuckDirX(-1);
					PONG.addOpponentPoints(1);
					if(PONG.getOpponentPoints()>=PONG.getPlayerPoints()+2) {
						System.out.println("Verloren");
						new AfterGame(1000);
					}
					PONG.setPuckSpeed(1.0);
					
				}
				
				if(PONG.getPuckX() < PONG.getPlayerX() +25 && PONG.getPuckX() > PONG.getPlayerX() && PONG.getPuckY() -20 < PONG.getPlayerY() + 150 &&  PONG.getPuckY() > PONG.getPlayerY()){
					PONG.setPuckDirX(1);
				//	PONG.addPuckSpeed(1);
					PONG.addPuckSpeed(0.02);
					new Musik("src/music/pucksound.wav");
				}
				
				if(PONG.getPuckX() < PONG.getOpponentX() && PONG.getPuckX() > PONG.getOpponentX() -20 && PONG.getPuckY() -20 < PONG.getOpponentY() + 150 &&  PONG.getPuckY() > PONG.getOpponentY()){
					PONG.setPuckDirX(-1);
				//	PONG.addPuckSpeed(1);
					PONG.addPuckSpeed(0.02);
					new Musik("src/music/pucksound.wav");

				}
				
			}
			
		}, 0, 4);
	}

}
