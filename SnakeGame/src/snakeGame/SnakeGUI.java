package snakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGUI extends Canvas implements KeyListener, Runnable {
	private final int WIDTH = 10;
	private final int HEIGHT = 10;
	private SnakeBode snek;
	private Food food;
	private Cell[][] grid;
	private boolean[] keys;
	private BufferedImage back;
	
	public SnakeGUI() 
	{
		setBackground(Color.BLACK);
		keys = new boolean[5];
		grid = new Cell[50][30];
		snek = new SnakeBode();
		Random r = new Random();
		food = new Food(randomInt(50), randomInt(30));
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}
	public int randomInt(int in) {
		Random r = new Random();
		return r.nextInt(in);
	}
	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;

		if(back == null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Snake Game ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,500,300);

		if(keys[0] == true)
		{
			snek.setDir(2);
			//snek.turn();
			//move left
		}
		if(keys[1] == true)
		{
			snek.setDir(3);
			//snek.turn();
			//move right
		}
		if(keys[2] == true)
		{
			snek.setDir(0);
			//snek.turn();
			//move up
		}
		if(keys[3] == true)
		{
			snek.setDir(1);
			//snek.turn();
			//move down
		}
		
		food.draw(graphToBack);
		snek.turn();
		snek.move();
		snek.draw(graphToBack);
		twoDGraph.drawImage(back, null, 0, 0);
	}
	
	public void update(Graphics window) 
	{
		paint(window);
	}
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}
	public void keyTyped(KeyEvent e)
	{

	}
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(200);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

