package snakeGame;

import java.awt.Color;

public class Food extends Cell
{
	public Food() 
	{
		super(Color.YELLOW);
	}
	public Food(int a, int b) {
		super(a, b, Color.YELLOW);
	}
}
