package GUI;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.*;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
public class JPanelLogo extends JPanel{
	private Image poza;
	private String nume;
	public JPanelLogo() {
		this.setVisible(true);
		this.poza=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/Johnny.jpeg").getImage();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		
		g2d.drawImage(poza, 0, 0, 1320, 299,null);
		g2d.setFont(new Font("Serif",Font.BOLD,20));
		g2d.setColor(Color.YELLOW);
		if(this.nume==null) {
			g2d.drawString("Bine ai venit!"+"Te rog sa alegi o companie pt practica", 620,150);
		}
		else
		{
			g2d.drawString("Bine ai venit "+this.nume+"Te rog frumos sa alegi o companie pentru practica", 620,150);
		}
		
		
		
	
	}
	public void seteazaNume(String Nume) {
		this.nume=Nume;
	}
	
}
