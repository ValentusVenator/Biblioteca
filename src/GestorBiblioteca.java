import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

    private List<Prestamo> prestamos;

    public GestorBiblioteca(){
        this.prestamos = new ArrayList<>();
    }

    public void prestarLlibre(Usuario usuario, Libro libro) {

        libro.prestar();

        Prestamo prestamo = new Prestamo(usuario, libro, LocalDate.now());
        prestamos.add(prestamo);

        usuario.agregarLibro(libro);

        System.out.println(usuario.getNom() + " ha agafat el llibre: " + libro.getTitol());
    }
}