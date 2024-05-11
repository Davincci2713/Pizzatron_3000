package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import co.edu.unbosque.model.Puntaje;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller  {

	private VentanaPrincipal ventana;
	private Puntaje puntaje;
	
	public Controller() throws FileNotFoundException{
		ventana = new VentanaPrincipal();
		asignarOyentes();
		funcionar();
	}
	
	private void funcionar() throws FileNotFoundException{

		puntaje = new Puntaje();
		puntaje.getArchivo().crearArchivosPuntajesMax();

		for(int i =0; i < 5; i++) {
			puntaje.getArrayNombres()[i] = puntaje.getArchivo().leerNombres(i);
		}
		int x = 0;
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0 ) {
				puntaje.getArrayPuntajesMax()[x][0] =  Integer.parseInt(puntaje.getArchivo().leerArchivo(i));
			}
			else {
				puntaje.getArrayPuntajesMax()[x][1] =  Integer.parseInt(puntaje.getArchivo().leerArchivo(i));
				x = x+1;
			}
		}

		puntaje.setMonedas(36);
		puntaje.setTiempo(1);
		puntaje.setNombre("aaaa");
		boolean y = true;
		for(int i = 0; i < 5; i++) {
			if(y){ 
				if(puntaje.getArrayPuntajesMax()[i][0] <= puntaje.getMonedas()) {
					if(puntaje.getArrayPuntajesMax()[i][1] >= puntaje.getTiempo()) {
						puntaje.getArrayPuntajesMax()[i][0] = puntaje.getMonedas();
						puntaje.getArrayPuntajesMax()[i][1] = puntaje.getTiempo();
						puntaje.getArrayNombres()[i] = puntaje.getNombre();
						y = false;
					}
				}
			}
		}
		
			puntaje.getArchivo().reescribirNombres(puntaje.getArrayNombres()[0] +"\n" + puntaje.getArrayNombres()[1] +"\n" + puntaje.getArrayNombres()[2] +"\n" + puntaje.getArrayNombres()[3] +"\n" + puntaje.getArrayNombres()[4]);

			puntaje.getArchivo().reescribirPuntajes(puntaje.getArrayPuntajesMax()[0][0] + "\n" + puntaje.getArrayPuntajesMax()[0][1] + "\n" + puntaje.getArrayPuntajesMax()[1][0] + "\n" + puntaje.getArrayPuntajesMax()[1][1] + "\n" + puntaje.getArrayPuntajesMax()[2][0] + "\n" + puntaje.getArrayPuntajesMax()[2][1] + "\n"+puntaje.getArrayPuntajesMax()[3][0] + "\n" + puntaje.getArrayPuntajesMax()[3][1] + "\n"+puntaje.getArrayPuntajesMax()[4][0] + "\n" + puntaje.getArrayPuntajesMax()[4][1]);
	}

	public void asignarOyentes() {

	}

	
	
	
}
