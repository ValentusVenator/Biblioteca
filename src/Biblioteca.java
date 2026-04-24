import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Libro> libros;

	/***
	 	o Afegir llibre a la biblioteca.
		o Buscar llibre a la biblioteca.
		o Buscar llibre a la biblioteca ignorant els accents.
		o Llistar llibres.
	 */
	
	public Biblioteca(){
		this.libros = new ArrayList<>();
	}

	public void agregarLibro(Libro libro){
		libros.add(libro);
	}
	
	// Buscar normal
	/**
	 * 
	 * @param titol
	 * @return
	 */
    public Libro buscarLlibre(String titol){
        for (Libro libro : libros){
            if (libro.getTitol().equalsIgnoreCase(titol)) {
                return libro;
            }
        }
        return null;
    }

    // Buscar ignorando tildes :D
    /**
     * 
     * @param titol
     * @return
     */
    public Libro buscarLibroSinAcentos(String titol){
        String titolNormalitzat = normalizar(titol);

        for (Libro libro : libros){
            if (normalizar(libro.getTitol()).equals(titolNormalitzat)) {
                return libro;
            }
        }
        return null;
    }
    
    public boolean existeLibro(String titol){
        return buscarLibroSinAcentos(titol) != null;
    }
    
    // metodo auxiliar que normaliza el texto :D
    /**
     * 
     * @param text
     * @return
     */
    private String normalizar(String text){
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .toLowerCase();
    }

    // mostrar lista de libros :D
    public void listarLibros(){
        for (Libro libro : libros){
            System.out.println(libro);
        }
    }
    
    //agregar libro unico no repetidos
    public boolean agregarLibroUnico(Libro libro){
	    if (buscarLibroSinAcentos(libro.getTitol()) != null){
	        return false;
	    }
	    libros.add(libro);
	    return true;
	}
    
    public List<Libro> getLibros(){      
        return libros; 
    }

}
