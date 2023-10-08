package javaejemplo;

/**
 * La clase Libro representa un libro en una biblioteca. Contiene información
 * sobre el título del libro, el autor, el número ISBN y el estado del libro
 * (disponible o reservado).
 */
public class Libro {

    // Atributos

    /**
     * El título del libro.
     */
    private String libro;

    /**
     * El nombre del autor del libro.
     */
    private String autor;

    /**
     * El número ISBN del libro.
     */
    private Integer isbn;

    /**
     * El estado actual del libro, que puede ser "DISPONIBLE" o "RESERVADO".
     */
    private Estado estado;

    // Enumeración Estado

    /**
     * Enumeración que representa los posibles estados de un libro: DISPONIBLE o RESERVADO.
     */
    public enum Estado {
        DISPONIBLE, RESERVADO
    }

    // Constructores

    /**
     * Constructor por defecto de la clase Libro.
     * Crea una instancia de Libro con todos los atributos inicializados a valores nulos.
     */
    public Libro() {

    }

    /**
     * Constructor de la clase Libro que permite inicializar todos los atributos.
     *
     * @param libro   El título del libro.
     * @param autor   El nombre del autor del libro.
     * @param isbn    El número ISBN del libro.
     * @param estado  El estado actual del libro (DISPONIBLE o RESERVADO).
     */
    public Libro(String libro, String autor, Integer isbn, Estado estado) {
        setLibro(libro);
        setAutor(autor);
        setIsbn(isbn);
        setEstado(estado);
    }

    // Métodos de acceso (getters y setters)

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getLibro() {
        return libro;
    }

    /**
     * Establece el título del libro.
     *
     * @param libro El título del libro.
     */
    public void setLibro(String libro) {
        this.libro = libro;
    }

    /**
     * Obtiene el nombre del autor del libro.
     *
     * @return El nombre del autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el nombre del autor del libro.
     *
     * @param autor El nombre del autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el número ISBN del libro.
     *
     * @return El número ISBN del libro.
     */
    public Integer getIsbn() {
        return isbn;
    }

    /**
     * Establece el número ISBN del libro.
     *
     * @param isbn El número ISBN del libro.
     */
    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene el estado actual del libro (DISPONIBLE o RESERVADO).
     *
     * @return El estado actual del libro.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del libro (DISPONIBLE o RESERVADO).
     *
     * @param estado El estado actual del libro.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Otros métodos

    /**
     * Devuelve una representación en cadena del libro.
     *
     * @return Una cadena que contiene información sobre el libro.
     */
    @Override
    public String toString() {
        return "Libro [getLibro()=" + getLibro() + ", getAutor()=" + getAutor() + ", getIsbn()=" + getIsbn()
                + ", getEstado()=" + getEstado() + "]";
    }
}
