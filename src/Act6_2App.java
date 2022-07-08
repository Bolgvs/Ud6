import javax.swing.JOptionPane;

public class Act6_2App {
	
	public static void main (String [] args) {
		
		// Petición de los números:
	
		String texto_nums = JOptionPane.showInputDialog("¿Cuántos números quieres generar?");
		
		int nums = Integer.parseInt(texto_nums), M, m, bucle;
		
		
		// Generamos X numeros randoms
		
		for (bucle = 0; bucle < nums; bucle++) {
			
			JOptionPane.showMessageDialog(null, "El número" + (bucle+1) + "tiene un valor de: " + aleatorio (M, m));
			
		}
		
	}
		
		// Para generar el número aleatorio entre el máximo y el mínimo
		
		public static int aleatorio (int M , int m) {
			
			String texto_M = JOptionPane.showInputDialog("¿Cuál es el número máximo en el intérvalo que quieres generar?");
			
			String texto_m = JOptionPane.showInputDialog("¿Cuál es el número mínimo en el intérvalo que quieres generar?");
			
			M = Integer.parseInt(texto_M);
			
			m = Integer.parseInt(texto_m);
			
			double random = (Math.random() * (M - m - 1) + (m)) + 1;
			
			return (int) random;
			
		}
		
}
