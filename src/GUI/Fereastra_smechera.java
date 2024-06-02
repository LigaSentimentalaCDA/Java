package GUI;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;
public class Fereastra_smechera extends JFrame  {
	private String Nume;
	private String Prenume;
	private JButton buton;
	private JPanelCustom panel1;
	private TextFieldModat lo;
	private JButton[] butoane;
	private JPanel panelcenterfirme;
	private JPanel panelcentergagici;
	private JPanelCustomPtButon1 h;
	private JPanelCustomButon2 h1;
	private JPanelCustomButon3 h2;
	private JPanelCustomButon4 h3;
	private JPanelLogo lg;
	private int i;
public Fereastra_smechera(String a,String b) {
	this.Nume=a;
	this.Prenume=b;
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.h=new JPanelCustomPtButon1();
	this.h1=new JPanelCustomButon2();
	this.h2=new JPanelCustomButon3();
	this.h3=new JPanelCustomButon4();
	this.lg=new JPanelLogo();
	this.lg.seteazaNume(this.Prenume);
	this.panel1=new JPanelCustom();
	this.lo=new TextFieldModat();
	this.panelcenterfirme=new JPanel();
	this.butoane=new JButton[4];
	this.butoane[0]=new JButton();
	this.butoane[0].setVisible(true);
	this.butoane[0].setLayout(null);
	this.h.setBounds(0, 0, 660, 210);
	this.butoane[0].add(h);
	this.butoane[1]=new JButton();
	this.butoane[1].setVisible(true);
	this.butoane[1].setLayout(null);
	this.h1.setBounds(0, 0, 660, 210);
	this.butoane[1].add(this.h1);
	this.butoane[2]=new JButton();
	this.butoane[2].setVisible(true);
	this.butoane[2].setLayout(null);
	this.h2.setBounds(0,0,660,210);
	this.butoane[2].add(this.h2);
	this.butoane[3]=new JButton();
	this.butoane[3].setVisible(true);
	this.butoane[3].setLayout(null);
	this.h3.setBounds(0,0,660,210);
	this.butoane[3].add(this.h3);
	this.panel1.adaugaImagine("C:/Users/AlexandruFlorin/Desktop/Screenshot 2024-04-26 222317.jpg");
	this.panel1.setBounds(200, 200,20, 20);
	this.lo.setBounds(30,97,200,80);
	this.setSize(1320,720);
	this.setTitle("FakeCastingAplicatiePrincipala");
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.lg.setLayout(null);
	this.panelcenterfirme.setBounds(0,300,1320,420);
	this.panelcenterfirme.setBackground(Color.RED);
	this.panelcenterfirme.setLayout(new GridLayout(2,2,5,5));
    this.panelcenterfirme.add(this.butoane[0]);
	this.panelcenterfirme.add(this.butoane[1]);
	this.panelcenterfirme.add(this.butoane[2]);
	this.panelcenterfirme.add(this.butoane[3]);
	this.add(this.panelcenterfirme);
	this.lg.setBounds(0,0,1320,299);
	this.butoane[0].addActionListener(e->{
		this.dispose();
		new FereastraRedTube();
	});
	this.butoane[1].addActionListener(e->{
		this.dispose();
		new FereastraBrazzers();
	});
	this.butoane[2].addActionListener(e->{
		this.dispose();
		new FereastraXVIDEOS();
	});
	this.butoane[3].addActionListener(e->{
		this.dispose();
		new FereastraXNXX();
	});


	this.add(this.lg);
	this.setVisible(true);

	
	
	
	
	
	
}

}
