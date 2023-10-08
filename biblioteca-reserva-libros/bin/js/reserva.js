class reserva{
	constructor (usuario, libro, fechaReserva, fechaDevolucion){
		this.usuario = usuario;
		this.libro = libro;
		this.fechaReserva = fechaReserva;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	get usuario() {
    return this._usuario;
  }

  set usuario(value) {
    this._usuario = value;
  }

  get libro() {
    return this._libro;
  }

  set libro(value) {
    this._libro = value;
  }

  get fechaReserva() {
    return this._fechaReserva;
  }

  set fechaReserva(value) {
    this._fechaReserva = value;
  }

  get fechaDevolucion() {
    return this._fechaDevolucion;
  }

  set fechaDevolucion(value) {
    this._fechaDevolucion = value;
  }
}