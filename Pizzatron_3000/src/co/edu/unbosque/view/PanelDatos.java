package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel Texto1,Texto2,Texto3,Texto4;
	
	private JTextField txtFrase;
	
	public PanelDatos() {
		setLayout(new GridLayout(4, 1));
		setBackground(Color.GREEN);
		setBorder(new TitledBorder("Informacion del individuo"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		Font letra = new Font("Arial", Font.BOLD, 24);
		Texto1 = new JLabel("papitas");
		Texto1.setFont(letra);
		add(Texto1);
		
		Texto2 = new JLabel("Origen: Portugal");
		Texto2.setFont(letra);
		add(Texto2);
		
		Texto3 = new JLabel("papitaqs 1");
		Texto3.setFont(letra);
		add(Texto3);
		
		Texto4 = new JLabel("otros: ------");
		Texto4.setFont(letra);
		add(Texto4);
		
		
	}

	public JLabel getTexto1() {
		return Texto1;
	}

	public void setTexto1(JLabel texto1) {
		Texto1 = texto1;
	}

	public JLabel getTexto2() {
		return Texto2;
	}

	public void setTexto2(JLabel texto2) {
		Texto2 = texto2;
	}

	public JLabel getTexto3() {
		return Texto3;
	}

	public void setTexto3(JLabel texto3) {
		Texto3 = texto3;
	}

	public JLabel getTexto4() {
		return Texto4;
	}

	public void setTexto4(JLabel texto4) {
		Texto4 = texto4;
	}

	public JTextField getTxtFrase() {
		return txtFrase;
	}

	public void setTxtFrase(JTextField txtFrase) {
		this.txtFrase = txtFrase;
	}


}
