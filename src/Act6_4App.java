import javax.swing.JOptionPane;

public class Act6_4App {
	
	public static void main (String [] args) {
		
		// Pedimos el número
		
		String texto_número = JOptionPane.showInputDialog("Escribe un número:");
				
		int número = Integer.parseInt(texto_número);
				
		JOptionPane.showMessageDialog(null, "El resultado es: " + Factorial(número));
		
	}
	
	public static int Factorial (int número) { 
		
		int factorial = número;
		
		for (int bucle = número -1; bucle != 0; bucle--) {
			
			factorial *= bucle;
			
		}
		
		return factorial;
		
	}

}
