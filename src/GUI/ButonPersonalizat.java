package GUI;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import  java.util.concurrent.TimeUnit;
//import java.awt.event.MouseListener;
public class ButonPersonalizat extends JButton implements MouseListener{
	private boolean ok;
	private int creste1;
	private int creste2;
	private int creste3;
	private int creste4;
	private int creste5;
	private int contor;
public ButonPersonalizat() {
	this.setBorder(null);
	this.setBackground(Color.black);
	this.addMouseListener(this);
	this.contor=0;
	ok=false;
	this.creste1=0;
	this.creste2=0;
	this.creste3=0;
	this.creste4=0;
	this.creste5=0;
	this.setText("Haide cu noi");
	this.setForeground(Color.WHITE);
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d=(Graphics2D)g;
//	g2d.setStroke(new BasicStroke());
	g2d.setColor(Color.ORANGE);
	g2d.drawRoundRect(0,0, 500, 70, 15, 15);
	if(ok==true) {
		g2d.setPaint(Color.YELLOW);
		for(this.creste1=1;this.creste1<500;this.creste1++) {
			for(this.creste2=1;this.creste2<70;this.creste2++) {
				g2d.fillRoundRect(1, 1,this.creste1,this.creste2, 15, 15);
			}
		}
		
	
	}
	else
	{
		repaint();
	}
}
public void mouseEntered(MouseEvent e) {
	this.ok=true;

}
public void mouseExited(MouseEvent e) {
	this.ok=false;
}
@Override
public void mouseReleased(MouseEvent e) {
	//Trebuie pusa pentru ca Interfata e abstracta si aceste metode de asemenea sunt abstracte ca altfel da eroare de compilare
	
}
public void mousePressed(MouseEvent e) {
	this.contor++;
	if(this.contor%2==1) {
		ok=true;
	}
	else
	{
		ok=false;
	}
}

public boolean okButon() {
	return this.ok;
}
@Override
public void mouseClicked(MouseEvent e) {
	//Trebuie pusa pentru ca Interfata e abstracta si aceste metode de asemenea sunt abstracte ca altfel da eroare ce compilare
	
}
}
