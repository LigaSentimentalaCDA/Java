package GUI;
import javax.swing.*;
import java.awt.*;
public class FereastraBrazzers extends JFrame {
	private JPanelFereastraBrazzers h;
	private JButton l;
	private JPanel o;
	private JPanel k;
	private JPanel t;
	private TextFieldModat[]txtfld;
	private JLabel []lbl;
	private ButonPersonalizatBrazzers btn;
   public FereastraBrazzers(){
	   this.setUndecorated(true);
	   this.h=new JPanelFereastraBrazzers();
	   this.btn=new ButonPersonalizatBrazzers();
	   this.setResizable(false);
	   this.setLayout(new GridLayout(3,1));
	   this.add(h);
	   this.o=new JPanel();
	   this.o.setLayout(new GridLayout(2,1));
	   this.o.setPreferredSize(new Dimension(660,210));
	   this.o.setBackground(Color.YELLOW);
	   this.k=new JPanel();
	   this.k.setLayout(new FlowLayout());
	   this.lbl=new JLabel[2];
	   this.lbl[0]=new JLabel();
	   this.lbl[1]=new JLabel();
	   this.lbl[0].setText("ActorFl");
	   this.lbl[0].setFont(new Font("SansSerif",Font.BOLD,30));
	   this.lbl[1].setFont(new Font("SansSerif",Font.BOLD,30));
	   this.txtfld=new TextFieldModat[2];
	   this.txtfld[0]=new TextFieldModat();
	   this.txtfld[1]=new TextFieldModat();
	   this.k.setBackground(Color.YELLOW);
	   this.k.add(this.lbl[0]);
	   this.k.add(this.txtfld[0]);
	   this.t=new JPanel();
	   this.lbl[1].setText("Locatie");
	   this.t.add(this.lbl[1]);
	   this.t.add(this.txtfld[1]);
	   this.t.setBackground(Color.YELLOW);
	   this.o.add(this.t);
	   this.o.add(this.k);
	   this.add(o);
	   this.add(btn);
	   this.pack();
	   this.setLocationRelativeTo(null);
	   this.setVisible(true);
	   
	  
   }
}
