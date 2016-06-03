package snakeGame;

import javax.swing.JFrame;
import java.awt.Component;

public class SnakeGUIRunner extends JFrame{

		private static final int WIDTH = 500;
		private static final int HEIGHT = 300;

		public SnakeGUIRunner()
		{
			super("Snake Game");
			setSize(WIDTH, HEIGHT);

			SnakeGUI theGame = new SnakeGUI();
			((Component)theGame).setFocusable(true);

			getContentPane().add(theGame);

			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		public static void main( String args[] )
		{
			SnakeGUIRunner run = new SnakeGUIRunner();
		}
}
