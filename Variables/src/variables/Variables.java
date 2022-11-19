/**
 * 
 */
package variables;

/**
 * @author Alvaro
 *
 */
public class Variables {

	/**
	 * 
	 */
	public Variables() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración o inicialización de dos variables
		
		int numero = 7;
		char letra='a';		
		
		//Declaración o inicialización de una constante
				
		final int NUMERO_HORAS = 8;
		
		//Impresión de los valores en la consola
		
		System.out.println(numero);
		System.out.println(letra);
		System.out.println(NUMERO_HORAS);
		
		// Si escribimos Sysout y presionamos ctrl+espacio es un atajo para escribir todo System.out.println()
		
		/* esto es un comentario tambien*/
		// A continuación los tipos de variables 
		
		/* LITERALES : Son los que tienen un valor dado */
		
		// Booleano verdadero
		boolean verdadero = true ;
		
		// Carácteres 
		char letra1 = 'b';
		
		// Numero 100
		byte by = 100;
		
		// Numero 1000
		short sh = 1000;
		
		// Numero 10000
		int in = 10000;
		
		// Valor 26 en decimal 
		int decVal = 26;
		
		//Valor 26 en hexadecimal, se coloca un 0x + un numero seguido de una letra hasta la F
		int hexVal = 0x1a;
		
		//Valor 26 en binario
		int biVal= 0b11010;
		
		//Cadena de carácteres
		String s = "Hola Mundo";
		//String x = 'Hola Mundo'; Las cadenas de caracteres van entre comilla doble
		
		System.out.println(hexVal);
		System.out.println(biVal);
		
		// ctrl + MAY + 7 comenta todas las lineas que estan señaladas
		
		//comentario para github


	}

}
