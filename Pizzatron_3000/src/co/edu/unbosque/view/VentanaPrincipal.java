package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelDatos panelDatos;
	private PanelImagenes panelImagenes;
	public PanelImagenes getPanelImagenes() {
		return panelImagenes;
	}

	public void setPanelImagenes(PanelImagenes panelImagenes) {
		this.panelImagenes = panelImagenes;
	}

	
	public VentanaPrincipal() {
		setTitle("Programa de Leer y Escribir Archivo");
		setSize(500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		panelDatos = new PanelDatos();
		getContentPane().add(panelDatos, BorderLayout.SOUTH);
		
		panelImagenes = new PanelImagenes();
		getContentPane().add(panelImagenes, BorderLayout.CENTER);
		
	}
	public void mostrarResultados(String textoConsola) {
		System.out.println(textoConsola);
	}
	

}
