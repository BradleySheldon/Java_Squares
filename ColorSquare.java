import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.util.*;

public class ColorSquare extends JComponent implements MouseListener
{
	private Color randColor;
	
	private boolean X_on=false;
	
	public ColorSquare() {
		this.addMouseListener(this);
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension (100, 100);
	}
	
	
	public void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, getWidth(), getHeight());
	if (X_on) {
		//newRandColor();
		g2.setColor (randColor);
		g2.fillRect(3,  3,  getWidth()-6,  getHeight()-6);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(10.0f));
		
		Line2D.Double diag1 = new Line2D.Double (0, 0, getWidth(), getHeight());
		Line2D.Double diag2 = new Line2D.Double (0, getHeight(), getWidth(), 0);
		
		g2.draw(diag1);
		g2.draw(diag2);
	}
	else {
		newRandColor();
		g2.setColor (randColor);
		g2.fillRect(3,  3,  getWidth()-6,  getHeight()-6);
	}
	}
		
	private void newRandColor() {
		Random rand = new Random();
		
		randColor= new Color (rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		X_on =!X_on;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
