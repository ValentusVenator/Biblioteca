public class Libro {

	private String titulo;
	private String autor;
	private boolean prestado;

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = false;
	}

	public void borrarLibro(Libro libro) {
		
	}
	public void prestar() {
		prestado = true;
	}

	public void retornar() {
		prestado = false;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return titulo + " de " + autor + (prestado ? " (No disponible)" : " (Disponible)");
	}
}