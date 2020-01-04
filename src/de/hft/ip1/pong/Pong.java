package de.hft.ip1.pong;

public class Pong {

	private int windowWidth;
	private int windowHeight;

	private int playerX = 20;
	private int playerY = 185;

	private int opponentX = 755;
	private int opponentY = 185;

	private int puckX = 200;
	private int puckY = 200;

	private boolean moveUp = false;
	private boolean moveDown = false;

	private int puckDirX = 1;
	private int puckDirY = -1;

	private int playerPoints = 0;
	private int opponentPoints = 0;

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
		this.opponentX = opponentX;
	}

	public int getOpponentY() {
		return opponentY;
	}

	public void setOpponentY(int opponentY) {
		this.opponentY = opponentY;
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

	public void addPuckX(int puckX) {
		this.puckX += puckX;
	}

	public void addPuckY(int puckY) {
		this.puckY += puckY;
	}

}
