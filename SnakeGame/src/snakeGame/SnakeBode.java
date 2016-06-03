package snakeGame;

import java.awt.Graphics;
import java.util.ArrayList;

public class SnakeBode {
private ArrayList<Snake> bode = new ArrayList<Snake>();
private int ct = 0;
private int dir;
private boolean isTurning;
private int tmpx;
private int tmpy;
	public SnakeBode() {
		for(int i = 0; i < 5; i++) {
			bode.add( new Snake(i, 0));
		}
	}
	public void addSegment() {
		int x = bode.get(bode.size()-1).getX();
		int y = bode.get(bode.size()-1).getY();
		//add segment in opposite direction of last segment
		if (bode.get(bode.size()-1).getDir() == 0)
			y+=1;
		else if (bode.get(bode.size()-1).getDir() == 1)
			y-=1;
		else if (bode.get(bode.size()-1).getDir() == 2)
			x+=1;
		else
			x-=1;
		bode.add(new Snake(x, y));
	}
	public void setDir(int a) {
		dir = a;
		tmpx =bode.get(0).getX();
		tmpy = bode.get(0).getY();
	}
	public void turn() {
		bode.get(ct).setDir(dir);
		ct++;
		if(ct > bode.size()-1) {
			ct = 0;
			isTurning = false;
		}
	}
	public void move() {
		for (Snake a : bode)
			a.move();
	}
	public void draw(Graphics window) {
		for (Snake a : bode) {
			a.draw(window);
		}
	}
	
}
