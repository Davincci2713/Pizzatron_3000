package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelImagenes extends JPanel {

	private JTextArea areaImagen;
	private JLabel img;
	private JLabel papas;
	
	public PanelImagenes() {
		setLayout(new BorderLayout());
		setBackground(Color.lightGray);
		setBorder(new TitledBorder("Imagen del individuo"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		img = new JLabel();
		img.setIcon(new ImageIcon("src/co/edu/unbosque/view/siuu.png"));	
		img.setBounds(0, 0, 400, 200);
		add(img);
		

		
		
		
		
	}

}
