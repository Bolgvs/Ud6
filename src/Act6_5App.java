import javax.swing.JOptionPane;

public class Act6_5App {
	
	public static void main (String [] args) {
		
		String texto_número = JOptionPane.showInputDialog("Escribe un número:");
		
		int número = Integer.parseInt(texto_número);
				
		JOptionPane.showMessageDialog(null, "El número en binario es: " + DecBin(número));
		
	}
	
	public static String DecBin (int número) {
		
		// Declaración de variables a usar
		
		String binario = "", BF = "";
		
		int num_binario;
		
		// Hace falta darle la vuelta al binario
		
		while (número >= 1) {
			
			binario += número % 2 + "";
			
			número /= 2;
			
		}
		
		// Aquí se la damos
		
		for (num_binario = binario.length()-1; num_binario != -1; num_binario--) {
			
			BF += binario.charAt(num_binario);
			
		}
		
		return BF;		
		
	}

}
