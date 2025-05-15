package ejercicio;

public class Pelicula implements Comparable<Pelicula>{
	private int id;
	private String nombre;
	private Genero genero;
	
	public Pelicula()
	{}
	
	public Pelicula(int id, String nombre, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " - " + "Titulo: " + nombre + " - Genero: " + genero;
	}

	@Override
	public int compareTo(Pelicula otraP) {
        return this.nombre.compareToIgnoreCase(otraP.nombre);
    }
}
