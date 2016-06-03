package snakeGame;

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	private int x;
	private int y;
	private Color col;
	public Cell(Color c) {
		x = 0;
		y = 0;
		col = c;
	}
	public Cell(int a, int b, Color c) {
		x = a;
		y = b;
		col = c;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void draw(Graphics window) {
		window.setColor(col);
		window.fillRect(x*10, y*10, 10, 10);
	}
}
