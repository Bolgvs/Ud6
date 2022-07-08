import javax.swing.JOptionPane;

public class Act6_11App {
	
	public static void main (String [] args) {
		
		// Petición tamaño array
		
		String texto_tamaño = JOptionPane.showInputDialog("Indica las dimensiones del array");
				
		// Creamos array y variables
				
		int tamaño = Integer.parseInt(texto_tamaño), M, m;
				
		// Definimos el intérvalo
				
		String texto_M = JOptionPane.showInputDialog("¿Cuál es el número máximo en el intérvalo que quieres generar?");
						
		String texto_m = JOptionPane.showInputDialog("¿Cuál es el número mínimo en el intérvalo que quieres generar?");
						
		// Conversión de String - Int
						
		M = Integer.parseInt(texto_M);
						
		m = Integer.parseInt(texto_m);
		
		// Creacion de los dos arrays
		
		int arrayA[] = new int[tamaño];
		
		int arrayB[] = new int[tamaño];
		
		// Funciones
		
		rellenarValores(arrayA, M, m);
		
		copiarVectores(arrayA, arrayB);
		
		multiplicarVectores(arrayA,arrayB);
	
	}
	
	public static void rellenarValores (int array[], int m, int M) {
		
		// Declaramos la variable "bucle"
		
		int bucle;
		
		for (bucle = 0; bucle < array.length; bucle++)
			
			array[bucle] = (int) (Math.random() * (M - m - 1) + (m)) + 1;
		
	}
	
	public static void copiarVectores (int[] arrayA, int[] arrayB ) {
		
		int[] números = new int[arrayA.length];
		
		int bucle = 0, bucle2, aleatorios;
		
		boolean repetido;
		
		for (bucle2 = 0; bucle2 < números.length; bucle2++) {
		
			números[bucle2] = -1;
		}
		
		while (bucle < números.length) {
			
			// Cada paso del bucle tenemos que hacer que vuelva a estar en false
			
			repetido = false; 
			
			aleatorios = (int) (Math.random() * números.length);
			
			// Comprovamos que el numero no se haya escrito anteriormente
			
			for (bucle2 = 0; bucle2 < números.length && !repetido; bucle2++) {
			
				if (aleatorios == números[bucle2]) {
					
					repetido = true;
				}
			}
			
			// En caso de no estar repetido, se guarda el numero de la posicion "bucle" en el arrayB en una posicion random
			
			if (!repetido) {
			
				números[bucle] = aleatorios;
				
				arrayB[aleatorios] = arrayA[bucle];
				
				bucle++;
			}
			
		}
		
	}
	
	// Para mostrar arrays, que se usa en el de multiplicar vectores
	
	public static void mostrarArray (int[] array) {
		
		int bucle;
			
			for (bucle = 0; bucle < array.length; bucle++) {
				
				JOptionPane.showMessageDialog(null, array[bucle]);
				
			}
	}
	
	public static void multiplicarVectores (int[] arrayA, int[] arrayB) {
		
		int[] arrayC = new int[arrayA.length];
		
		int bucle;
		
		for (bucle = 0; bucle < arrayC.length; bucle++) {
			
			arrayC[bucle] = arrayA[bucle] * arrayB[bucle];
			
		}
		
		JOptionPane.showMessageDialog(null, "Array A");
		
		mostrarArray(arrayA);
		
		JOptionPane.showMessageDialog(null, "Array B");
		
		mostrarArray(arrayB);
		
		JOptionPane.showMessageDialog(null, "Array C");
		
		mostrarArray(arrayC);
		
	}

}