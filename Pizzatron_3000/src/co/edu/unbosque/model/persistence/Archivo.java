package co.edu.unbosque.model.persistence;
import co.edu.unbosque.model.*;
import java.io.*;
import java.util.Scanner;


public class Archivo {
	
	File ubicacionNombres;
	File ubicacionPuntajes;

	
	public Archivo() {
		
		
		

	}
	
	public void crearArchivosPuntajesMax(){
		try {
		ubicacionPuntajes = new File("PuntajesMax.txt");
		ubicacionNombres = new File("PuntajesMaxNombres.txt");

			
			ubicacionNombres.createNewFile();
			ubicacionPuntajes.createNewFile();	
			
		
	 
		}catch(IOException e){
		}
	}
	
	public void reescribirPuntajes(String n) {
		
		try {
			
			FileWriter archivo = new FileWriter(ubicacionPuntajes);
			PrintWriter reescribir = new PrintWriter(archivo);
			reescribir.write(n);
			archivo.close();
			
		}catch(IOException e){
			
		}	
	}
	public void reescribirNombres(String n) {
		
		try {
			
			FileWriter archivo = new FileWriter(ubicacionNombres);
			PrintWriter reescribir = new PrintWriter(archivo);
			reescribir.write(n);
			archivo.close();
			
		}catch(IOException e){
			
		}	
	}
	public String leerArchivo(int j) {
		FileReader archivo;
		BufferedReader lector;
		String contenido = "";
		try {
			archivo = new FileReader(ubicacionPuntajes);
			lector = new BufferedReader(archivo);
			if(archivo.ready()) {
				for(int i = 0; i <= j; i++) {
					contenido = lector.readLine();
				}
			}
		}catch (IOException e) {
		}
		return contenido;
	}
	public String leerNombres(int j) {	
		FileReader archivo;
		BufferedReader lector;
		String contenido = "";
		try {
			archivo = new FileReader(ubicacionNombres);
			lector = new BufferedReader(archivo);
			if(archivo.ready()) {
				for(int i = 0; i <= j; i++) {
					contenido = lector.readLine();
				}
			}
		}catch (IOException e) {
		}
		return contenido;
	}
}
