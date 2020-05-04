package ejercicio63;

import java.util.ArrayList;

public class Personaje{
	double altura;
	ArrayList<String> habilidades=new ArrayList<String>();
	int inteligencia;
	int peso;
	String tipo;
	public Personaje(double alt, ArrayList<String> hab, int intel, int pes, String tip) {
		altura=alt;
		habilidades=hab;
		inteligencia=intel;
		peso=pes;
		tipo=tip;
	}
	public void calcularTipo() {
		//se calcula el tipo de personaje segun las habilidades que poseen
	}
}
