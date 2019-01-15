package fp.daw.examen;

public class Ejercicio3 {

	/*
	 * 2 puntos
	 * 
	 *  Define, después de este comentario, un método llamado 'stringToArray2D' que
	 *  reciba como parámetro una cadena de caracteres y retorne un array de caracteres
	 *  de dos dimensiones que tendrá exactamente dos filas y el contenido siguiente en
	 *  cada una de ellas:
	 *  
	 *  	* Primera fila: caracteres de la cadena que ocupan posiciones pares (0, 2, 4, ...).
	 *  	* Segunda fila: caracteres de la cadena que ocupan posiciones impares (1, 3, 5, ...).
	 *  
	 *  El número de columnas en cada fila no excederá del estrictamente necesario para
	 *  almacenar los caracteres que se indican en cada caso.
	 *  
	 */
	
	public static char[][] stringToArray2D (String cadena){
		char[][] vector = new char[2][cadena.length()];
		int j = 0;
		int h = 0;
		
		for(int i=0; i<cadena.length(); i++) {
			if(i % 2 == 0) {
				vector[0][j] = cadena.charAt(i);
				j++;
			}else {
				vector[1][h] = cadena.charAt(i);
				h++;
			}
		}
		return vector;
	}
	
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray2D' mostrando por pantalla el resultado de su ejecución.
	 * Se mostrará en cada fila del array en una línea de la pantalla utilizando para
	 * ello el método definido en el ejercicio 1.
	 * 
	 */
	
	public static void main(String[] args) {
		char[][] b;
		
		b = stringToArray2D("adios");
		
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();		}
	}

}
