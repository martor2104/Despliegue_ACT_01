/**
 * Clase que representa un libro.
 */
class Libro {
    /**
     * Crea una instancia de la clase Libro con valores predeterminados.
     */
    constructor() {
        /**
         * Título del libro.
         * @type {string}
         */
        this.titulo = "Título del libro";

        /**
         * Autor del libro.
         * @type {string}
         */
        this.autor = "Autor del libro";
    }

    /**
     * Obtiene una representación en cadena del libro.
     * @returns {string} Representación en cadena del libro.
     */
    toString() {
        return `Título: ${this.titulo}, Autor: ${this.autor}`;
    }
}

/**
 * Clase que representa una reserva.
 */
class Reserva {
    /**
     * Crea una instancia de la clase Reserva con valores predeterminados.
     */
    constructor() {
        /**
         * Fecha de la reserva.
         * @type {Date}
         */
        this.fecha = new Date();

        /**
         * Usuario de la reserva.
         * @type {string}
         */
        this.usuario = "Usuario de reserva";
    }

    /**
     * Obtiene una representación en cadena de la reserva.
     * @returns {string} Representación en cadena de la reserva.
     */
    toString() {
        return `Fecha de reserva: ${this.fecha}, Usuario: ${this.usuario}`;
    }
}

/**
 * Función principal que crea instancias de Libro y Reserva, y muestra información sobre ellas.
 */
function main() {
    // Crear instancias de Libro
    const l1 = new Libro();
    const l2 = new Libro();

    // Crear instancias de Reserva
    const r1 = new Reserva();
    const r2 = new Reserva();

    // Mostrar información sobre las instancias creadas
    console.log("Libro 1: " + l1.toString());
    console.log("Libro 2: " + l2.toString());

    console.log("Reserva 1: " + r1.toString());
    console.log("Reserva 2: " + r2.toString());
}

// Llamar a la función main para ejecutar el código
main();
