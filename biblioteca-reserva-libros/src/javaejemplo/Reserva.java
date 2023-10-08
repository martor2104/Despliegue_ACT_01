package javaejemplo;

/**
 * La clase Reserva representa una reserva de un libro realizada por un usuario en una biblioteca.
 * Contiene información sobre el usuario, el libro, la fecha de reserva y la fecha de devolución prevista.
 */
public class Reserva {

    // Atributos

    /**
     * El nombre del usuario que realiza la reserva.
     */
    private String usuario;

    /**
     * El título del libro que se reserva.
     */
    private String libro;

    /**
     * La fecha en la que se realiza la reserva en formato de cadena.
     */
    private String fechaReserva;

    /**
     * La fecha prevista de devolución del libro en formato de cadena.
     */
    private String fechaDevolucion;

    // Constructores

    /**
     * Constructor por defecto de la clase Reserva.
     * Crea una instancia de Reserva con todos los atributos inicializados a valores nulos.
     */
    public Reserva() {
        
    }

    /**
     * Constructor de la clase Reserva que permite inicializar todos los atributos.
     *
     * @param usuario         El nombre del usuario que realiza la reserva.
     * @param libro           El título del libro que se reserva.
     * @param fechaReserva    La fecha en la que se realiza la reserva en formato de cadena.
     * @param fechaDevolucion La fecha prevista de devolución del libro en formato de cadena.
     */
    public Reserva(String usuario, String libro, String fechaReserva, String fechaDevolucion) {
        setUsuario(usuario);
        setLibro(libro);
        setFechaReserva(fechaReserva);
        setFechaDevolucion(fechaDevolucion);
    }

    // Métodos de acceso (getters y setters)

    /**
     * Obtiene el nombre del usuario que realizó la reserva.
     *
     * @return El nombre del usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre del usuario que realiza la reserva.
     *
     * @param usuario El nombre del usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el título del libro reservado.
     *
     * @return El título del libro.
     */
    public String getLibro() {
        return libro;
    }

    /**
     * Establece el título del libro reservado.
     *
     * @param libro El título del libro.
     */
    public void setLibro(String libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la fecha en la que se realizó la reserva en formato de cadena.
     *
     * @return La fecha de reserva en formato de cadena.
     */
    public String getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece la fecha en la que se realizó la reserva en formato de cadena.
     *
     * @param fechaReserva La fecha de reserva en formato de cadena.
     */
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Obtiene la fecha prevista de devolución del libro en formato de cadena.
     *
     * @return La fecha de devolución prevista en formato de cadena.
     */
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha prevista de devolución del libro en formato de cadena.
     *
     * @param fechaDevolucion La fecha de devolución prevista en formato de cadena.
     */
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    // Otros métodos

    /**
     * Devuelve una representación en cadena de la reserva.
     *
     * @return Una cadena que contiene información sobre la reserva.
     */
    @Override
    public String toString() {
        return "Reserva [getUsuario()=" + getUsuario() + ", getLibro()=" + getLibro() + ", getFechaReserva()="
                + getFechaReserva() + ", getFechaDevolucion()=" + getFechaDevolucion() + "]";
    }
}
