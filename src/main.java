
public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro llibre1 = new Libro("1984", "George Orwell");
        Libro llibre2 = new Libro("El petit príncep", "Antoine de Saint-Exupéry");

        biblioteca.agregarLibro(llibre1);
        biblioteca.agregarLibro(llibre2);

        Usuario usuario1 = new Usuario("Carla");
        GestorBiblioteca gestor = new GestorBiblioteca();
        
        
        gestor.prestarLlibre(usuario1, llibre1);        
        
    }
}