import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Llibre> llibres;

	/***
	 	o Afegir llibre a la biblioteca.
		o Buscar llibre a la biblioteca.
		o Buscar llibre a la biblioteca ignorant els accents.
		o Llistar llibres.
	 */
	
	public Biblioteca(){
		this.llibres = new ArrayList<>();
	}

	public void afegirLlibre(Llibre llibre){
		llibres.add(llibre);
	}
	
	// Buscar normal
    public Llibre buscarLlibre(String titol){
        for (Llibre llibre : llibres){
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null;
    }

    // Buscar ignorando tildes :D
    public Llibre buscarLlibreSinAcentos(String titol){
        String titolNormalitzat = normalitzar(titol);

        for (Llibre llibre : llibres){
            if (normalitzar(llibre.getTitol()).equals(titolNormalitzat)) {
                return llibre;
            }
        }
        return null;
    }
    
    public boolean existeixLlibre(String titol){
        return buscarLlibreSinAcentos(titol) != null;
    }
    
    // metodo auxiliar que normaliza el texto :D
    private String normalitzar(String text){
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .toLowerCase();
    }

    // mostrar lista de libros :D
    public void llistarLlibres(){
        for (Llibre llibre : llibres){
            System.out.println(llibre);
        }
    }
    
    public List<Llibre> getLlibres(){ 
        return llibres; 
    }

}
