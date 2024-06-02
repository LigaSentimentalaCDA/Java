package GUI;
import javax.swing.*;
import java.awt.*;
public class JPanelCustom extends JPanel {
	private String Imagine;
	private Image poza;
public JPanelCustom() {
	this.setVisible(true);
}
public void adaugaImagine(String Imagine) {
	this.Imagine=Imagine;
	this.poza=new ImageIcon(this.Imagine).getImage();
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d=(Graphics2D)g;
	g2d.drawImage(this.poza,0,0,null);

}
}
