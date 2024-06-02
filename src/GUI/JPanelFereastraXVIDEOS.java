package GUI;
import javax.swing.*;
import java.awt.*;
public class JPanelFereastraXVIDEOS extends JPanel {
private Image poza;
public JPanelFereastraXVIDEOS() {
	this.setPreferredSize(new Dimension(660,210));
	this.setVisible(true);
	this.poza=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/download.jpg").getImage();
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2D=(Graphics2D)g;
	g2D.drawImage(this.poza,0,0,660,210,null);
}
}
