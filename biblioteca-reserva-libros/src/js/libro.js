/**
 * Clase que representa un libro en una biblioteca.
 */
class Libro {
  /**
   * Crea una instancia de la clase Libro.
   *
   * @param {string} libro - El título del libro.
   * @param {string} autor - El nombre del autor del libro.
   * @param {number} isbn - El número ISBN del libro.
   * @param {string} estado - El estado del libro, que puede ser "disponible" o "reservado".
   */
  constructor(libro, autor, isbn, estado) {
    this.libro = libro;
    this.autor = autor;
    this.isbn = isbn;
    this.estado = estado;
  }

  /**
   * Obtiene el título del libro.
   *
   * @returns {string} El título del libro.
   */
  get libro() {
    return this._libro;
  }

  /**
   * Establece el título del libro.
   *
   * @param {string} value - El título del libro.
   */
  set libro(value) {
    this._libro = value;
  }

  /**
   * Obtiene el nombre del autor del libro.
   *
   * @returns {string} El nombre del autor del libro.
   */
  get autor() {
    return this._autor;
  }

  /**
   * Establece el nombre del autor del libro.
   *
   * @param {string} value - El nombre del autor del libro.
   */
  set autor(value) {
    this._autor = value;
  }

  /**
   * Obtiene el número ISBN del libro.
   *
   * @returns {number} El número ISBN del libro.
   */
  get isbn() {
    return this._isbn;
  }

  /**
   * Establece el número ISBN del libro.
   *
   * @param {number} value - El número ISBN del libro.
   */
  set isbn(value) {
    this._isbn = value;
  }

  /**
   * Obtiene el estado del libro.
   *
   * @returns {string} El estado del libro, que puede ser "disponible" o "reservado".
   */
  get estado() {
    return this._estado;
  }

  /**
   * Establece el estado del libro.
   *
   * @param {string} value - El estado del libro, que puede ser "disponible" o "reservado".
   */
  set estado(value) {
    this._estado = value;
  }
}

/**
 * Constante que define los posibles estados de un libro.
 */
export const estado = {
  /**
   * Estado "disponible".
   * @type {string}
   */
  disponible: "disponible",

  /**
   * Estado "reservado".
   * @type {string}
   */
  reservado: "reservado"
};
