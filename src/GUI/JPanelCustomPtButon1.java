package GUI;
import javax.swing.*;
import java.awt.*;
public class JPanelCustomPtButon1 extends JPanel{
	private Image poza;
public JPanelCustomPtButon1() {
	this.setVisible(true);
	//this.setBounds(0, 0, 300, 300);
	this.poza=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/th.jpg").getImage();
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d=(Graphics2D)g;
	g2d.drawImage(poza, 0, 0, 660, 210,null);
}
	
}
