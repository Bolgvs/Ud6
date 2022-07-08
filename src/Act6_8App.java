import javax.swing.JOptionPane;

public class Act6_8App {
	
	public static void main (String [] args) {
		
		int array[] = new int[10];
		
		rellenarValores(array);
		
		mostrarValores(array);
		
	}
	
	public static void rellenarValores (int array[]) {
		
		// Declaramos la variable "bucle"
		
		int bucle;
		
		for (bucle = 0; bucle < array.length; bucle++)
			
			array[bucle] = Integer.parseInt(JOptionPane.showInputDialog("Di un numero"));
		
	}
	
	public static void mostrarValores (int array[]) {
		
		// Declaramos la variable "bucle"
		
		int bucle;
				
		for (bucle = 0; bucle < array.length; bucle++) {
		
		JOptionPane.showMessageDialog(null, "El valor en la posición " + bucle + " es: " + array[bucle]);
		
		}
		
	}

}