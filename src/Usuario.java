import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<Libro> librosPrestados;
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.librosPrestados = new ArrayList<>();
	}
	
	public String getNombre() { 
		return nombre; 
	}
	
	public List<Libro> getLibrosPrestados() { 
		return librosPrestados;
	}
	public void anadirLibro(Libro llibre) {
		librosPrestados.add(llibre);
	}
	public void retornarLibro(Libro llibre) {
		librosPrestados.remove(llibre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLibrosPrestados(List<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
	
}