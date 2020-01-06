package de.hft.ip1.pong;

import java.awt.Dimension;

public class Pong {

	private int playerX = 20;
	private int playerY;

	private int opponentX;
	private int opponentY;

	private double puckX;
	private double puckY;

	private boolean moveUp = false;
	private boolean moveDown = false;

	private int puckDirX = 1;
	private int puckDirY = -1;
	private double puckSpeed = 1.0;
	private int points = 0;


	private int playerPoints = 0;
	private int opponentPoints = 0;

	public Pong(Dimension playFieldSize) {
		opponentX = playFieldSize.width - 50;
		opponentY = playFieldSize.height / 2 - 75;
		playerY = playFieldSize.height / 2 - 75;
		puckX = playFieldSize.width / 2;
		puckY = playFieldSize.height / 2;
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
		this.opponentX = opponentX;
	}

	public int getOpponentY() {
		return opponentY;
	}

	public void setOpponentY(int opponentY) {
		this.opponentY = opponentY;
	}

	public double getPuckX() {
		return puckX;
	}

	public void setPuckX(double puckX) {
		this.puckX = puckX;
	}

	public double getPuckY() {
		return puckY;
	}

	public void setPuckY(double puckY) {
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
		return puckDirX;
	}

	public void setPuckDirX(int puckDirX) {
		this.puckDirX = puckDirX;
	}

	public int getPuckDirY() {
		return puckDirY;
	}

	public void setPuckDirY(int puckDirY) {
		this.puckDirY = puckDirY;
	}

	public int getPlayerPoints() {
		return playerPoints;
	}

	public void setPlayerPoints(int playerPoints) {
		this.playerPoints = playerPoints;
	}

	public int getOpponentPoints() {
		return opponentPoints;
	}

	public void setOpponentPoints(int opponentPoints) {
		this.opponentPoints = opponentPoints;
	}

	public void addPlayerPoints(int playerPoints) {
		this.playerPoints += playerPoints;
	}

	public void addOpponentPoints(int opponentPoints) {
		this.opponentPoints += opponentPoints;
	}

	public void addPuckDirX(int puckDirX) {
		this.puckDirX += puckDirX;
	}

	public void addPuckDirY(int puckDirY) {
		this.puckDirY += puckDirY;
	}

	public void addOpponentY(int opponentY) {
		this.opponentY += opponentY;
	}

	public void addOpponentX(int opponentX) {
		this.opponentX += opponentX;
	}

	public void addPlayerY(int playerY) {
		this.playerY += playerY;
	}

	public void addPlayerX(int playerX) {
		this.playerX += playerX;
	}

	public void addPuckX(double puckX) {
		this.puckX += puckX;
	}

	public void addPuckY(double puckY) {
		this.puckY += puckY;
	}

	public double getPuckSpeed() {
		return puckSpeed;
	}

	public void setPuckSpeed(double puckSpeed) {
		this.puckSpeed = puckSpeed;
	}

	public void addPuckSpeed(double puckSpeed) {
		this.puckSpeed += puckSpeed;
	}
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	public void addPoints(int points) {
		this.points += points;
	}


}
