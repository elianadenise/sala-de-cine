package saladecine;

import java.util.Scanner;

public class Boleteria {

	public final static int CONSULTAR_SI_ESTA_OCUPADA = 1;
	public final static int OCUPAR_BUTACA = 1;
	public final static int CANTIDAD_DE_BUSTACAS_OCUPADAS = 2;
	public final static int ACOMODAR_GRUPO = 3;
	public final static int SALIR = 0;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Sala cine = new Sala("Cine de Eliana");
		cine.inicializarArray();
		System.out.println("Bienvenidx al " + cine.getNombre());

		Integer opcion = SALIR;
		do {
			System.out.println("Que desea realizar? "
					+ "\n1. Consultar si una butaca se encuentra ocupada"
					+ "\n2. Consultar la cantidad de butacas ocupadas"
					+ "\n3. Acomodar un grupo"
					+ "\n0. Salir");
			opcion = entrada.nextInt();
			System.out.println("----------------------------");
			switch(opcion) {
			case CONSULTAR_SI_ESTA_OCUPADA:
				System.out.println("----------------------------");
				System.out.println("Ingrese la fila: ");
				int fila = entrada.nextInt()-1;
				System.out.println("Ingrese la columna: ");
				int columna = entrada.nextInt()-1;
				if(cine.estaOcupada(fila, columna) == false) {
					System.out.println("La butaca esta disponible; \nDesea reservar la butaca? 1. Si, 2. No");
					int siOno = entrada.nextInt();
					if(siOno == OCUPAR_BUTACA) {
						if(cine.ocuparButaca(fila, columna)) {
							System.out.println("Se ocupo la butaca con exito\n");
						} else {
							System.out.println("Ocurrió un error\n");
						}
					}
				} else {
					System.out.println("La butaca se encuentra ocupada\n");
				}
				break;
			case CANTIDAD_DE_BUSTACAS_OCUPADAS:
				System.out.println("----------------------------");
				System.out.println(cine.butacasOcupadas() + " butacas estan ocupadas\\n");
				break;
			case ACOMODAR_GRUPO:
				System.out.println("----------------------------");
				System.out.println("Ingrese la cantidad de personas del grupo: \n");
				int personas = entrada.nextInt();
				//System.out.println(cine.hayEspacioPara(personas));
				if(cine.hayEspacioPara(personas)) {
					System.out.println("Existe disponibilidad; \nDesea reservar las butacas? 1. Si, 2. No");
					System.out.println("FALTA QUE FUNCIONE ESTO");
				} else {
					System.out.println("No existe disponibilidad, pruebe con un grupo mas pequeño.");
				}
				
				break;
				
			}
		}while(opcion != SALIR);
		
	}

}
