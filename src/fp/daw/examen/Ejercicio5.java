package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner (System.in);
		int numero_al;
		int numero_us;
		
		String respuesta;
		do {
			int contador = 1;
			do {
				
				numero_al = r.nextInt(1);
				System.out.println("Escribe un numero:");
				numero_us = sc.nextInt();
				
				if(numero_al == numero_us) {
					System.out.println("Has acertado el numero.");
					System.out.println("Número de intentos: " + contador);
				}else {
					contador++;
				}
			}while(numero_al != numero_us);
			
			System.out.println("¿Quieres volver a jugar? (S-N)");
			
			respuesta = sc.next();
			
		}while(respuesta.toLowerCase().equals("s"));
		
	}

}
