import javax.swing.JOptionPane;

public class Act6_6App {
	
	public static void main (String [] args) {
		
		String texto_número = JOptionPane.showInputDialog("Escribe un número:");
		
		int número = Integer.parseInt(texto_número);
				
		JOptionPane.showMessageDialog(null, "Las cifras del número son: " + Cifras(número));
		
	}
	
	public static int Cifras (int número) {
		
		int cifras = 0;
		
		// Limito a 20 cifras
			
		while (número > 20) {
				
			número /= 20;
				
			cifras++;
				
			}
			
			return ++cifras; // La primera posición cuenta cómo 0
			
	}
		
}