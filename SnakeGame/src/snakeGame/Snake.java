package snakeGame;

import java.awt.Color;

public class Snake extends Cell
{
	private boolean contact = false;
	private int dir;
	/* 0 = up
	 * 1 = down
	 * 2 = left
	 * 3 = right
	 */
	//private int gridpieces = 2500;
	//private int timer = 80;
	//private double randomNum = Math.random()*30;
	//private Image image1 = null;
	//private Image image2 = null;

	private int spd;
	
	//private int[][] xCoord = new int[50][50];
	public Snake() {
		super(Color.YELLOW);
		dir = 3;
		spd = 1;
	}
	public Snake(int in) {
		super(Color.YELLOW);
		dir = in;
		spd = 1;
	}
	public Snake(int a, int b) {
		super(a, b, Color.YELLOW);
		dir = 3;
		spd = 1;
	}
	public void setSpd(int c) {
		spd = c;
	}
	public void move() {
		if(dir == 0) {// up 
			setY(getY()-spd);
		}
		else if (dir == 1) {//down
			setY(getY()+spd);
		}
		else if (dir == 2) {//left
			setX(getX()-spd);
		}
		else if (dir == 3) {//right
			setX(getX()+spd);
		}
	}
	public void setDir(int in) {
		dir = in;
	}
	public int getDir() {
		return dir;
	}
	public boolean ifContactsFood()
	{
		return true;
	}
}

