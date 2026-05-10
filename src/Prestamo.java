import java.time.LocalDate;

    /**
     *     Creacion de las variables de Prestamo
     */

public class Prestamo  {
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Libro[] listaLibro;

    /**
     *   Declaramos el constructor de la clase
     */

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaPrestamo) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusWeeks(2);
        this.listaLibro = new Libro[10];
        System.out.println("Has alquilado el libro: " + libro.getTitulo() + " el dia: " + fechaPrestamo);
        System.out.println("Tienes que devolver el libro antes de: " + fechaDevolucion);
    }

    /**
     * Metodo que recoge el libro que se quiere tomar prestado
     * añadiendo la fecha de prestamo y la fecha en la que se debe devolver
     * @param libro sabemos que Libro es
     */

	public void gestionarPrestamo(Libro libro) {
		usuario.anadirLibro(libro);
        System.out.println("Has alquilado el libro: " + libro.getTitulo() + " el dia: " + fechaPrestamo);
        System.out.println("Tienes que devolver el libro antes de: " + fechaDevolucion);
    }

    /**
     *  Metodo que define el numero maximo de libros que se puede tener a la vez
     * @param numeroMaximo Define el numero maximo de libros
     */

    public void maximoLibros(int numeroMaximo) {
    	this.listaLibro[10] = listaLibro[numeroMaximo];        	
    }


    /**
     *     Getters y Setters
     */

    public Usuario getUsuario() {
        return usuario;
    }
    public Libro getLibro() {
        return libro;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public Libro[] getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(Libro[] listaLibro) {
		this.listaLibro = listaLibro;
	}
}
