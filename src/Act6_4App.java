import javax.swing.JOptionPane;

public class Act6_4App {
	
	public static void main (String [] args) {
		
		// Pedimos el número
		
		String texto_número = JOptionPane.showInputDialog("Escribe un número:");
				
		int número = Integer.parseInt(texto_número);
				
		JOptionPane.showMessageDialog(null, "El resultado es: " + Factorial(número));
		
	}
	
	public static int Factorial (int número) {
		
		for (int bucle = 0; bucle < número; bucle++) {
			
			int resultado = número * (número - 1);
			
		}
		
		return resultado;
		
	}

}
