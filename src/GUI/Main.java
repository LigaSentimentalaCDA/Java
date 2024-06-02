package GUI;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
	//	new Fereastra();
		//new Fereastra_smechera("Cv","Altcv");
		JFrame g=new JFrame();
		JLabel j=new JLabel();
		JLabel o=new JLabel();
		JLabel t=new JLabel();
		JButton[]f=new JButton[9];
		f[0]=new JButton();

		  j.setText("Label1");
		  o.setText("Label2");
		  t.setText("Label3");
		g.setSize(300,300);
		g.getContentPane().setBackground(Color.red);
		j.setBounds(0, 5, 30, 80);
		j.setBackground(Color.BLACK);
		j.setOpaque(true);
		g.setLayout(null);
		j.setForeground(Color.WHITE);
		j.setVerticalTextPosition(JLabel.RIGHT);

		g.add(j);
		g.setVisible(true);


	}
 
}
