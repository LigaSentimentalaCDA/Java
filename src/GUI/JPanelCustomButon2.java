package GUI;
import javax.swing.*;
import java.awt.*;
public class JPanelCustomButon2 extends JPanel {
	private Image poza;
	public JPanelCustomButon2() {
		this.setVisible(true);
		this.poza=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/brazzers-logo-betran-firmanza.jpg").getImage();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.drawImage(poza, 0, 0, 660, 210,null);
	}
}
