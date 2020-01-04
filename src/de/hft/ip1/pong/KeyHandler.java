package de.hft.ip1.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static de.hft.ip1.pong.InGame.PONG;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			PONG.setMoveUp(true);

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			PONG.setMoveDown(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			PONG.setMoveUp(false);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			PONG.setMoveDown(false);
		}

	}

}
