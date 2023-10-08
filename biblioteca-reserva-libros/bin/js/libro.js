class libro{
	

	constructor (libro, autor, isbn, estado){
		this.libro = libro;
		this.autor = autor;
		this.isbn = isbn;
		this.estado = estado;
		
		
	}
	
	get libro() {
    return this._libro;
  }

  set libro(value) {
    this._libro = value;
  }

  get autor() {
    return this._autor;
  }

  set autor(value) {
    this._autor = value;
  }

  get isbn() {
    return this._isbn;
  }

  set isbn(value) {
    this._isbn = value;
  }

  get estado() {
    return this._estado;
  }

  set estado(value) {
    this._estado = value;
  }
}

export const estado = {
	disponible: "disponible",
	reservado: "reservado"	
}




