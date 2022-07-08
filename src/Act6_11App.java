import javax.swing.JOptionPane;

public class Act6_11App {
	
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
		
		int arrayA[] = new int[tamaño];
		
		int arrayB[] = new int[tamaño];
		
		rellenarValores(arrayA, min, max);
		
		copiarVectores(arrayA, arrayB);
		
		multiplicarVectores(arrayA,arrayB);
	
	}
	
	public static void rellenarValores (int array[], int m, int M) {
		
		// Declaramos la variable "bucle"
		
		int bucle;
		
		for (bucle = 0; bucle < array.length; bucle++)
			
			array[bucle] = (int) (Math.random() * (M - m - 1) + (m)) + 1;
		
	}
	
	public static void copiarVectores (int arrayA, int arrayB ) {
		
	
		
	}
	
	public static void multiplicarVectores (int arrayA, int arrayB) {
		
		
		
	}

}