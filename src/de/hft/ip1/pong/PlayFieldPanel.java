package de.hft.ip1.pong;

import java.awt.*;

import javax.swing.JLabel;
import static de.hft.ip1.pong.Application.ROOTFRAME;
import static de.hft.ip1.pong.Application.PONG;
public class PlayFieldPanel extends JLabel{

		// TODO Auto-generated constructor stub
	

	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, ROOTFRAME.getWidth(), ROOTFRAME.getHeight());
		
		g.setColor(Color.WHITE);
		
		for(int i = 0; i<= 30; i++){
			g.fillRect(ROOTFRAME.getWidth()/2 -5, i * 20, 10, 10);
		}
		
		g.fillRect(PONG.getPlayerX(), PONG.getPlayerY(), 25, 150);
		g.fillRect(PONG.getOpponentX(), PONG.getOpponentY(), 25, 150);
		
		g.drawString("" + PONG.getPlayerPoints(), ROOTFRAME.getWidth()/2 - 95, 75);
		g.drawString("" + PONG.getOpponentPoints(), ROOTFRAME.getWidth()/2 + 50, 75);
		
		g.fillRect(PONG.getPuckX(), PONG.getPuckY(), 20, 20);
		
		repaint();
		
	}
}
