package GUI;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.*;
import javax.swing.ImageIcon;	
public class JPanelCustomButon4 extends JPanel {
	private Image poza;
	public JPanelCustomButon4() {
		this.setVisible(true);
		this.poza=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/XNXX.jpg").getImage();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.drawImage(poza, 0, 0, 660, 210,null);
	}
}
