import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

	private List<Prestamo> prestamos;
	private List<Usuario> usuarios;

	public GestorBiblioteca(){
		this.prestamos = new ArrayList<>();
	}
	
	public void listarUsuarios() {
	    for (int i = 0; i < usuarios.size(); i++) {
	        System.out.println(usuarios.get(i));
	    }
	}

	public void prestarLlibre(Usuario usuario, Libro libro) {

		libro.prestar();

		Prestamo prestamo = new Prestamo(usuario, libro, LocalDate.now());
		prestamos.add(prestamo);

		usuario.anadirLibro(libro);

		System.out.println(usuario.getNombre() + " ha agafat el llibre: " + libro.getTitulo());
		
		// controlador de limite de libros para el usuario
		if (!usuario.puedeAnadirLibro()) {
			System.out.println("L'usuari ha arribat al límit de llibres.");
			return;
		}
		
	}


}
