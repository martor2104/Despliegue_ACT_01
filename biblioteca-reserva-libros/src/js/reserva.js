/**
 * Clase que representa una reserva de un libro.
 */
class Reserva {
  /**
   * Crea una instancia de la clase Reserva.
   * @param {string} usuario - El usuario que realiza la reserva.
   * @param {string} libro - El título del libro que se reserva.
   * @param {Date} fechaReserva - La fecha en que se realiza la reserva.
   * @param {Date} fechaDevolucion - La fecha de devolución prevista del libro.
   */
  constructor(usuario, libro, fechaReserva, fechaDevolucion) {
      /**
       * El usuario que realiza la reserva.
       * @type {string}
       * @private
       */
      this._usuario = usuario;

      /**
       * El título del libro que se reserva.
       * @type {string}
       * @private
       */
      this._libro = libro;

      /**
       * La fecha en que se realiza la reserva.
       * @type {Date}
       * @private
       */
      this._fechaReserva = fechaReserva;

      /**
       * La fecha de devolución prevista del libro.
       * @type {Date}
       * @private
       */
      this._fechaDevolucion = fechaDevolucion;
  }

  /**
   * Obtiene el usuario que realiza la reserva.
   * @returns {string} El usuario que realiza la reserva.
   */
  get usuario() {
      return this._usuario;
  }

  /**
   * Establece el usuario que realiza la reserva.
   * @param {string} value - El nuevo usuario que realiza la reserva.
   */
  set usuario(value) {
      this._usuario = value;
  }

  /**
   * Obtiene el título del libro que se reserva.
   * @returns {string} El título del libro que se reserva.
   */
  get libro() {
      return this._libro;
  }

  /**
   * Establece el título del libro que se reserva.
   * @param {string} value - El nuevo título del libro que se reserva.
   */
  set libro(value) {
      this._libro = value;
  }

  /**
   * Obtiene la fecha en que se realiza la reserva.
   * @returns {Date} La fecha en que se realiza la reserva.
   */
  get fechaReserva() {
      return this._fechaReserva;
  }

  /**
   * Establece la fecha en que se realiza la reserva.
   * @param {Date} value - La nueva fecha en que se realiza la reserva.
   */
  set fechaReserva(value) {
      this._fechaReserva = value;
  }

  /**
   * Obtiene la fecha de devolución prevista del libro.
   * @returns {Date} La fecha de devolución prevista del libro.
   */
  get fechaDevolucion() {
      return this._fechaDevolucion;
  }

  /**
   * Establece la fecha de devolución prevista del libro.
   * @param {Date} value - La nueva fecha de devolución prevista del libro.
   */
  set fechaDevolucion(value) {
      this._fechaDevolucion = value;
  }
}
