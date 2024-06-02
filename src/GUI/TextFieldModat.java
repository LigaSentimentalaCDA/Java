package GUI;
import javax.swing.*;
import java.awt.*;
public class TextFieldModat extends JTextField {
public TextFieldModat() {
	this.setBorder(null);
	this.setPreferredSize(new Dimension(500,50));
	this.setBackground(Color.ORANGE);
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d=(Graphics2D)g;
	g2d.drawRoundRect(0, 0,499, 49, 5,5);
	
}
}
