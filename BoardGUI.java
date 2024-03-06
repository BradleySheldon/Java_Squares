import java.awt.*;
import javax.swing.*;

public class BoardGUI
{
	private static int SIZE = 6;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame ("Color Squares");
		JPanel panel = new JPanel (new GridLayout(SIZE, SIZE));

		// TODO - Add ColorSquares array here
		ColorSquare[][] blocks=new ColorSquare[SIZE][SIZE];
		
		for (int r=0; r<SIZE; r++)
			for (int c=0; c<SIZE; c++)
			{
				blocks[r][c]=new ColorSquare();
				panel.add(blocks[r][c]);
			}
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		// TODO - Add loop with sleep and repaint here
		while (true)
		{
			try {
				Thread.sleep(1000);
				panel.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}