package biblioteca;

import java.time.LocalDate;

public class Prestamo  {
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Libro[] listaLibro;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaPrestamo) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusWeeks(2);
        this.listaLibro = new Libro[10];
        System.out.println("Has alquilado el libro: " + libro.getTitulo() + " el dia: " + fechaPrestamo);
        System.out.println("Tienes que devolver el libro antes de: " + fechaDevolucion);
    }

	public void gestionarPrestamo(Libro libro) {
		usuario.anadirLibro(libro);
        System.out.println("Has alquilado el libro: " + libro.getTitulo() + " el dia: " + fechaPrestamo);
        System.out.println("Tienes que devolver el libro antes de: " + fechaDevolucion);
    }

    public void maximoLibros(int numeroMaximo) {
    	this.listaLibro[10] = listaLibro[numeroMaximo];        	
    }

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