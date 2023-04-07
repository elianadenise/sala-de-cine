package saladecine;

public class Butaca {
	// ATRIBUTOS
	private Boolean ocupada;
	private static int numeroButaca = 0;
	
	// CONSTRUCTOR
	public Butaca() {
		Butaca.numeroButaca++;
		this.ocupada = false;
	}

	// GETS & SETS
	public Boolean getOcupada() {
		return ocupada;
	}

	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}
}
