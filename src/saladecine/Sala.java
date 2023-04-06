package saladecine;

public class Sala {
	/*
	 * Implementar la clase SalaDeCine, tal que tenga operaciones para: 
	 * 1. Crearla con la cantidad de butacas totales, y cantidad de filas 
	 * 2. Consultar si una butaca está ocupada (referida por fila y asiento) 
	 * 3. Ocupar una butaca	determinada, siempre que ésta no esté previamente ocupada 
	 * 4. Consultar la cantidad total de butacas ocupadas 
	 * 5. Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila:
	 * boolean hayEspacioPara(int cantidadDePersonas)
	 */
	
	// ATRIBUTOS
	private Butaca enSala[][];
	
	// CONSTRUCTOR
	//punto uno
	public Sala() {
		this.enSala = new Butaca[20][15];
	}
	
	//punto dos 
	public Boolean estaOcupada(Integer fila, Integer columna) {
		boolean ocupada = enSala[fila][columna].getOcupada();
		return ocupada;
	}
	
	//punto tres
	public Boolean ocuparButada(Integer fila, Integer columna) {
		Boolean seOcupo = false;
		if(this.estaOcupada(fila, columna) == false) {
			enSala[fila][columna].setOcupada(true);
		}
		return seOcupo;
	}
	
	//punto cuatro
	public Integer butacasOcupadas() {
		Integer cantidad = 0;
		for(int i = 0; i < enSala.length; i++) {
			for(int j = 0; j < enSala[i].length; j++) {
				if(this.estaOcupada(i, j) == true) {
					cantidad = cantidad + 1;
				}
			}
		}
		return cantidad;
	}
}
