package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
public class Puntaje {
	
	private int monedas;
	private int tiempo;
	private String nombre;
	private int[][] arrayPuntajesMax;
	private String[] arrayNombres;
	private Archivo archivo;

	
	public Puntaje(){
		
		arrayPuntajesMax = new int[5][2];
		arrayNombres = new String[5];
		archivo = new Archivo();
		
	}

	public int getMonedas() {
		return monedas;
	}
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public Archivo getArchivo() {
		return archivo;
	}
	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public int[][] getArrayPuntajesMax() {
		return arrayPuntajesMax;
	}

	public void setArrayPuntajesMax(int[][] arrayPuntajesMax) {
		this.arrayPuntajesMax = arrayPuntajesMax;
	}

	public String[] getArrayNombres() {
		return arrayNombres;
	}

	public void setArrayNombres(String[] arrayNombres) {
		this.arrayNombres = arrayNombres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
