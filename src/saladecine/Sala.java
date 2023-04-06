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
	public Sala() {
		this.enSala = new Butaca[20][15];
	}
	
	
}
