import javax.swing.JOptionPane;

public class Act6_10App {
	
	public static void main (String [] args) {
		
		// Petición tamaño array
		
		String texto_tamaño = JOptionPane.showInputDialog("Indica las dimensiones del array");
		
		// Creamos array y variables
		
		int tamaño = Integer.parseInt(texto_tamaño), M, m;
		
		int array [] = new int [tamaño];
		
		// Definimos el intérvalo
		
		String texto_M = JOptionPane.showInputDialog("¿Cuál es el número máximo en el intérvalo que quieres generar?");
				
		String texto_m = JOptionPane.showInputDialog("¿Cuál es el número mínimo en el intérvalo que quieres generar?");
				
		// Conversión de String - Int
				
		M = Integer.parseInt(texto_M);
				
		m = Integer.parseInt(texto_m);
		
		
		aleatorio(array, M, m);
		
		JOptionPane.showMessageDialog(null, "El número más grande es: " + Máximo(array));
		
	}
	

	// Para generar el número aleatorio entre el máximo y el mínimo
	
	public static void aleatorio (int array[], int M , int m) {
		
		int bucle = 0, random;
		
		while (bucle < array.length) {
		
			random = (int) (Math.random() * (M - m - 1) + (m)) + 1;
			
			if (Primo(random)) {
				
				array[bucle] = random;
				
				bucle++;
				
			}
		}
		
		
	}
	
	// Copio el código del ejercicio 3 ya que es un método para saber si es primo o no
	
	public static boolean Primo (int número) {
		
		boolean numprimo = true;
		
		// Si un número llega a su mitad sin haberse podido dividir entre 2, es primo
		
		for (int bucle = 2; bucle < (número / 2) && numprimo; bucle++) {
			
			if (número % bucle == 0) {
				
				numprimo = false;
				
			}
		
		}
		
		return numprimo;

	}
	
	public static int Máximo (int array[] ) {
		
		// Declaración de variables
		
		int M = array[0], bucle;
		
		// for y if
		
		for (bucle = 1; bucle < array.length; bucle++) {
			

			if (array[bucle] > M) {
				
				M = array[bucle];
				
			}	
			
		}
		
		return M;
			
	}

}