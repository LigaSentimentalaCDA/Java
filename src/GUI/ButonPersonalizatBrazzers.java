package GUI;
import javax.swing.*;
import java.awt.*;
public class ButonPersonalizatBrazzers extends JButton{
	public ButonPersonalizatBrazzers() {
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
		g2d.drawString("AplicaBrazzers", 320,102);
		g2d.setFont(new Font("SansSerif",Font.BOLD,50));
		
		
	}
	

}
