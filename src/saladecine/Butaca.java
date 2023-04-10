package saladecine;

public class Butaca {
	// ATRIBUTOS 
	private Boolean ocupada;
	private int numeroButaca = 0;
	
	// CONSTRUCTOR
	public Butaca() {
		numeroButaca++;
		this.ocupada = false;
	}

	// GETS & SETS
	public Boolean getOcupada() {
		return ocupada;
	}

	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}

	public int getNumeroButaca() {
		return numeroButaca;
	}

	public void setNumeroButaca(int numeroButaca) {
		numeroButaca = numeroButaca;
	}
	
}
