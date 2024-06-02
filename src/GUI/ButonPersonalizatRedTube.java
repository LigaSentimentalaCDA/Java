package GUI;

import javax.swing.*;
import java.awt.*;

public class ButonPersonalizatRedTube extends JButton{
public ButonPersonalizatRedTube() {
	super();
	this.setVisible(true);
	this.setBorder(null);
	this.setBackground(Color.BLACK);
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d=(Graphics2D)g;
	g2d.setColor(Color.WHITE);
	g2d.drawRoundRect(0, 0, 659,209, 5, 5);
	g2d.setColor(Color.RED);
	g2d.drawString("AplicaRedTube", 320,102);
	g2d.setFont(new Font("SansSerif",Font.BOLD,50));
	
	
}
}
