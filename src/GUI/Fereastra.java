package GUI;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.font.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Fereastra extends JFrame implements KeyListener {
	private JPanel[]j; 
	private JLabel texte;
	private JLabel[]textBox;
	private TextField[]a;
	private String[] Enumeratii;
	private JPanel pls;
	private JRadioButton[]butoane;
	private  int contor;
	private ButonPersonalizat btn;
	private ImageIcon check;
	private ImageIcon denie;
	private JLabel[]textBox2;
	private int i;
	private boolean okrb1;
	private boolean okrb2;
	private boolean okrb3;
	private int irb;
	private int contorizatorirb1;
	private int contorizatorirb2;
	private int contorizatorirb3;
public Fereastra() {
	this.check=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/checklist.png");
	this.denie=new ImageIcon("C:/Users/AlexandruFlorin/Desktop/remove.png");
	this.btn=new ButonPersonalizat();
	this.pls=new JPanel();
	this.contor=0;
	this.setUndecorated(true);
	this.setResizable(false);
	this.setSize(600,600);

	this.setLayout(new GridLayout(8,1));
	this.texte=new JLabel();
	this.irb=0;
	this.contorizatorirb1=0;
	this.contorizatorirb2=0;
	this.contorizatorirb3=0;

	//this.texte.setPreferredSize(new Dimension(300,50));
	this.texte.setText("Inscriere Pt FAKECASTING");
	this.texte.setForeground(Color.WHITE);
	this.texte.setFont(new Font("Times New Roman",Font.BOLD,40));
	this.texte.setHorizontalTextPosition(JLabel.CENTER);
	this.texte.setVerticalTextPosition(JLabel.CENTER);
	this.texte.setBackground(Color.BLACK);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.texte.setOpaque(true);
	this.add(this.texte);
	//this.add(k);
	this.j=new JPanel[5];
	this.a=new TextField[5];
	this.textBox=new JLabel[5];
	this.Enumeratii= new String[5];
	this.butoane=new JRadioButton[3];
	this.textBox2=new JLabel[5];
	this.pls=new JPanel();
	this.pls.setBackground(Color.BLACK);
	this.butoane[0]=new JRadioButton("Am luat la cunostinta ca il voi calari pe Jamal pana varsta isi va spune cuvantul");
	this.butoane[1]=new JRadioButton("Sustin faptul ca am varsta mai mare sau egala de 18 ani ca sa nu dam de belele");
	this.butoane[2]=new JRadioButton("Am luat la cunostinta prezenta mea obligatorie a olimpiadei organizata de BUG Mafia");
	this.butoane[0].setForeground(Color.YELLOW);
	this.butoane[1].setForeground(Color.YELLOW);
	this.butoane[2].setForeground(Color.YELLOW);
	this.Enumeratii[0]="NumeDvs ";
	this.Enumeratii[1]="Prenume ";
	this.Enumeratii[2]="TatalDvs ";
	this.Enumeratii[3]="MamaDvs ";
	this.Enumeratii[4]="CastingLa ";
	//this.setLayout(null);
	for(int i=0;i<5;i++)
	{	this.j[i]=new JPanel();
		this.j[i].setPreferredSize(new Dimension(300,50));
		this.j[i].setLayout(new FlowLayout());
		this.a[i]=new TextField();
		this.a[i].setPreferredSize(new Dimension(220,30));
		this.a[i].setBackground(Color.yellow);
		this.a[i].addKeyListener(this);
		this.textBox[i]=new JLabel();
		this.textBox2[i]=new JLabel();
		this.textBox2[i].setIcon(this.denie);
		this.textBox[i].setText(this.Enumeratii[i]);
	    this.textBox[i].setVerticalAlignment(JLabel.CENTER);
	    this.textBox[i].setHorizontalAlignment(JLabel.LEFT);
	    this.textBox[i].setFont(new Font("Times New Roman",Font.BOLD,22));
	    this.textBox[i].setForeground(Color.RED);
	    this.j[i].add(this.textBox[i]);
		this.j[i].add(this.a[i]);
		this.j[i].add(this.textBox2[i]);
		
		
	this.j[i].setBackground(Color.BLACK);
	this.add(this.j[i]);	
	}
	
	this.pls.setLayout(new GridLayout(3,1));
	this.butoane[0].setOpaque(false);
	this.butoane[1].setOpaque(false);
	this.butoane[2].setOpaque(false);
	this.butoane[0].addActionListener(e->{this.contorizatorirb1++;
		if(this.contorizatorirb1%2==1) {
			this.okrb1=true;
			}
		else
		{
			this.okrb1=false;
		}
	
		});
	this.butoane[1].addActionListener(e->{
		this.contorizatorirb2++;
		if(this.contorizatorirb2%2==1)
		{
			this.okrb2=true;
		}
		else
		{
			this.okrb2=false;
		}
	});
	this.butoane[2].addActionListener(e->{
		this.contorizatorirb3++;
		if(this.contorizatorirb3%2==1) {
			this.okrb3=true;
		}
		else
		{
			this.okrb3=false;
			
		}
	
	});
	this.pls.add(this.butoane[0]);
	this.pls.add(this.butoane[1]);
	this.pls.add(this.butoane[2]);
	this.btn.addActionListener(e->{
		if(verifica()==true) {
			if(verifica2nd()==true) {
				if(this.a[1].getText().charAt(this.a[1].getText().length()-1)!='a') {
					JOptionPane.showMessageDialog(null,"E pentru Gagici baaa","EroareDeGen",JOptionPane.ERROR_MESSAGE);
				}else
				{
				this.dispose();
				new Fereastra_smechera(this.returneazaNume(),this.returneazaPrenume());}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Ai uitat sa completezi un radioButton", "EroareLaCastingDeGagici",JOptionPane.ERROR_MESSAGE);
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Ai uitat sa completezi cv", "EroareLaCastingDeGagici",JOptionPane.ERROR_MESSAGE);
		}
	});
	this.add(this.pls);
	this.add(this.btn);
	this.pack();
	this.setLocationRelativeTo(null);
	this.setVisible(true);
}
private String returneazaNume() {
		return this.a[0].getText();
	
}
private String returneazaPrenume() {
	
		return this.a[1].getText();
}

@Override
public void keyTyped(KeyEvent e) {
if(e.getSource()==this.a[0]) {
	if(this.a[0].getText().isEmpty()) {
		this.textBox2[0].setIcon(denie);
	}
	else
	{
		this.textBox2[0].setIcon(check);
	}
	}
if(e.getSource()==this.a[1]) {
	if(this.a[1].getText().isEmpty()) {
		this.textBox2[1].setIcon(denie);
	}
	else
	{
		this.textBox2[1].setIcon(check);
	}
}
if(e.getSource()==this.a[2]) {
	if(this.a[2].getText().isEmpty()) {
		this.textBox2[2].setIcon(denie);
	}
	else
	{
		this.textBox2[2].setIcon(check);
	}
}
if(e.getSource()==this.a[3]) {
	if(this.a[3].getText().isEmpty()) {
		this.textBox2[3].setIcon(denie);
	}
	else
	{
		this.textBox2[3].setIcon(check);
	}
}
if(e.getSource()==this.a[4]) {
	if(this.a[4].getText().isEmpty()) {
		this.textBox2[4].setIcon(denie);
	}
	else
	{
		this.textBox2[4].setIcon(check);
	}
}

}
private boolean verifica() {
	int nr;
	nr=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i].getText().isEmpty()==false) {
			nr++;
		}
	}
	if(nr==a.length) {
		return true;
	}
	return false;
}
private boolean verifica2nd() {
	if(this.okrb1==true&&this.okrb2==true&&this.okrb3==true) {
		return true;
	}
	return false;
}
@Override
public void keyPressed(KeyEvent e) {
//Aceasta functie este creeata cu scopul de a nu da eroare chit ca nu o folosesc deoarece este abstracta
	
}
@Override
public void keyReleased(KeyEvent e) {
	//Aceasta functie este creeata cu scopul de a nu da eroare chit ca nu o folosesc deoarece este abstracta
	
}


}
