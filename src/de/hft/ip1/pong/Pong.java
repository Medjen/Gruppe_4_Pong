package de.hft.ip1.pong;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Pong {

	private int windowWidth;
	private int windowHeight;

	private int playerX = 20, playerY = 185;
	private int opponentX = 755, opponentY = 185;
	private int puckX = 200, puckY = 200;

	private boolean moveUp = false, moveDown = false;

	private int PuckDirX = 1, PuckDirY = -1;

	private int PlayerPoints = 0, OpponentPoints = 0;

	public Pong(int windowWidth, int windowHeight) {
		this.windowHeight = windowHeight;
		this.windowWidth = windowWidth;

	}

	public int getWindowWidth() {
		return windowWidth;
	}

	public void setWindowWidth(int windowWidth) {
		this.windowWidth = windowWidth;
	}

	public int getWindowHeight() {
		return windowHeight;
	}

	public void setWindowHeight(int windowHeight) {
		this.windowHeight = windowHeight;
	}

	public int getPlayerX() {
		return playerX;
	}

	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public int getPlayerY() {
		return playerY;
	}

	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}

	public int getOpponentX() {
		return opponentX;
	}

	public void setOpponentX(int opponentX) {
		this.opponentX += opponentX;
	}

	public int getOpponentY() {
		return opponentY;
	}

	public void setOpponentY(int opponentY) {
		this.opponentY += opponentY;
	}

	public int getPuckX() {
		return puckX;
	}

	public void setPuckX(int puckX) {
		this.puckX = puckX;
	}

	public int getPuckY() {
		return puckY;
	}

	public void setPuckY(int puckY) {
		this.puckY = puckY;
	}

	public boolean isMoveUp() {
		return moveUp;
	}

	public void setMoveUp(boolean moveUp) {
		this.moveUp = moveUp;
	}

	public boolean isMoveDown() {
		return moveDown;
	}

	public void setMoveDown(boolean moveDown) {
		this.moveDown = moveDown;
	}

	public int getPuckDirX() {
		return PuckDirX;
	}

	public void setPuckDirX(int puckDirX) {
		PuckDirX += puckDirX;
	}

	public int getPuckDirY() {
		return PuckDirY;
	}

	public void setPuckDirY(int puckDirY) {
		PuckDirY += puckDirY;
	}

	public int getPlayerPoints() {
		return PlayerPoints;
	}

	public void setPlayerPoints(int playerPoints) {
		PlayerPoints += playerPoints;
	}

	public int getOpponentPoints() {
		return OpponentPoints;
	}

	public void setOpponentPoints(int opponentPoints) {
		OpponentPoints += opponentPoints;
	}

}
