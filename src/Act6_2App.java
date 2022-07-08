import javax.swing.JOptionPane;

public class Act6_2App {
	
	public static void main (String [] args) {
		
		// Petición de los números:
	
		String texto_nums = JOptionPane.showInputDialog("¿Cuántos números quieres generar?");
		
		// Conversión de String - Int
		
		int nums = Integer.parseInt(texto_nums), M, m, bucle;
		
		// Definimos el intérvalo
		
		String texto_M = JOptionPane.showInputDialog("¿Cuál es el número máximo en el intérvalo que quieres generar?");
		
		String texto_m = JOptionPane.showInputDialog("¿Cuál es el número mínimo en el intérvalo que quieres generar?");
		
		// Conversión de String - Int
		
		M = Integer.parseInt(texto_M);
		
		m = Integer.parseInt(texto_m);
		
		// Generamos X numeros randoms
		
		for (bucle = 0; bucle < nums; bucle++) {
			
			JOptionPane.showMessageDialog(null, "El número " + (bucle+1) + "tiene un valor de: " + aleatorio(M, m));
			
		}
		
	}
		
		// Para generar el número aleatorio entre el máximo y el mínimo
		
		public static int aleatorio (int M , int m) {
			
			double random = (Math.random() * (M - m - 1) + (m)) + 1;
			
			// Se suma y se resta 1 para que se muestren los extremos
			
			return (int) random;
			
		}
		
}
