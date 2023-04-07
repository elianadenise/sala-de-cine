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
	private String nombre;
	private Butaca enSala[][]= new Butaca[20][15];
	
	// CONSTRUCTOR
	// punto uno
	public Sala(String nombre) {
		this.nombre = nombre;
		this.inicializarArray();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// punto dos 
	public Boolean estaOcupada(Integer fila, Integer columna) {
		boolean ocupada = enSala[fila][columna].getOcupada();
		return ocupada;
	}
	
	// punto tres
	public Boolean ocuparButaca(Integer fila, Integer columna) {
		Boolean seOcupo = false;
		if(this.estaOcupada(fila, columna) == false) {
			enSala[fila][columna].setOcupada(true);
			seOcupo = true;
		}
		return seOcupo;
	}
	
	// punto cuatro
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
	
	// punto cinco
	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		Boolean hayEspacio = false;
		int contador = 0;
		for(int i = 0; i < enSala.length; i++) {
			for(int j = 0; j < enSala[i].length; j++) {
				if(enSala[i][j] != null && enSala[i][j].getOcupada() == false) {
					contador = contador + 1;
					if(contador == cantidadDePersonas) {
						hayEspacio = true;
					}
				} else if (enSala[i][j] != null && enSala[i][j].getOcupada() == true) {
					contador = 0;
					hayEspacio = false;
				}
			}
		}
		return hayEspacio;
	}
	
	/*public String hayEspacioPara(Integer cantidadDePersonas) {
		String hayEspacio = "";
		int contador = 0;
		for(int i = 0; i < enSala.length; i++) {
			for(int j = 0; j < enSala[i].length; j++) {
				if(enSala[i][j] != null && enSala[i][j].getOcupada() == false) {
					contador = contador + 1;
					hayEspacio += enSala[i][j].getNumeroButaca() + ", ";
					if(contador == cantidadDePersonas) {
						break;
					}
				} else if (enSala[i][j] != null && enSala[i][j].getOcupada() == true) {
					contador = 0;
					hayEspacio = "No existe sisponibilidad";
				}
			}
		}
		return hayEspacio;
	}*/
	
	// inicializar array
	public void inicializarArray() {
		for(int i = 0; i < enSala.length; i++) {
			for(int j = 0; j < enSala[i].length; j++) {
				if(enSala[i][j] == null) {
					enSala[i][j] = new Butaca();
				}
			}
		}
	}
}
