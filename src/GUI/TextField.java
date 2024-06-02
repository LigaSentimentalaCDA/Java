package GUI;
import javax.swing.*;
import java.awt.*;
public class TextField extends JTextField{
	public TextField(){
		this.setPreferredSize(new Dimension(220,30));
		this.setBorder(null);
	}
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	Graphics2D g2D=(Graphics2D)g;
    	g2D.drawRoundRect(0, 0,219, 29, 5,5);
    }
	
	
 

}

