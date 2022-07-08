import javax.swing.JOptionPane;

public class Act6_9App {
	
	public static void main (String [] args) {
		
		String texto_tamaño = JOptionPane.showInputDialog("Indica las dimensiones del array");
		
		int tamaño = Integer.parseInt(texto_tamaño);
		
		int array[] = new int[tamaño];
		
		rellenarValores(array, 0, 9);
		
		mostrarValores(array);
		
	}
	
	public static void rellenarValores (int array[], int m, int M) {
		
		// Declaramos la variable "bucle"
		
		int bucle;
		
		for (bucle = 0; bucle < array.length; bucle++)
			
			array[bucle] = (int) (Math.random() * (M - m - 1) + (m)) + 1;
		
	}
	
	public static void mostrarValores (int array[]) {
		
		// Declaramos la variable "bucle" y suma
		
		int bucle, suma = 0;
				
		for (bucle = 0; bucle < array.length; bucle++) {
			
			suma += array[bucle];
			
			JOptionPane.showMessageDialog(null, "El valor en la posición " + bucle + " es: " + array[bucle]);			
			
		}
		
		JOptionPane.showMessageDialog(null, "La suma es: " + suma);
		
		}

}