import javax.swing.JOptionPane;

public class Act6_3App {
	
	public static void main (String [] args) {
		
		// Pedimos el número
		
		String texto_número = JOptionPane.showInputDialog("Escribe un número:");
		
		int número = Integer.parseInt(texto_número);
		
		JOptionPane.showMessageDialog(null, "¿Es el número primo? " + Primo(número));
		
	}
	
	// Para saber si es número primo
	
	public static boolean Primo (int número) {
		
		boolean numprimo = true;
		
		int bucle;
		
		for (bucle = 2; bucle < (número / 2) && numprimo; bucle++) {
			
			if (número % bucle == 0) {
				
				numprimo = false;
				
			}
		
		}
		
		return numprimo;

	}
}
