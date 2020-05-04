package ejercicio63;
import java.util.ArrayList;

public class Catalogo{
	public ArrayList <Personaje> listaPersonajes= new ArrayList<Personaje>();
	
    public Personaje crearPersonaje(double alt, ArrayList<String> hab, int intel, int pes, String tip) {
	Personaje personaje= new Personaje(alt, hab, intel, pes, tip);
	return personaje;
  }
	public void agregarPersonaje(Personaje personaje) {
		listaPersonajes.add(personaje);
	}
	public Personaje seleccionarPersonaje(int posicionDelPersonaje) {
		return listaPersonajes.get(posicionDelPersonaje);
	}
};
