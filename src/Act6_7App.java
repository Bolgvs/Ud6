import javax.swing.JOptionPane;

public class Act6_7App {
	
	public static void main (String [] args) {
		
		seleccionCambio();
		
	}
	
	public static void seleccionCambio() {
		
		// Declaro variables
		
		String texto_número = JOptionPane.showInputDialog("Escribe la cantidad:");
		
		int número = Integer.parseInt(texto_número);
		
		// Petición figura
		
		String camb = JOptionPane.showInputDialog(null, "¿A qué moneda quieres cambiar? (Libras, Dólares, Yenes)").toLowerCase();
				
		// Condiciones:
			
		switch (camb) {
				
		case "libras":
				
			JOptionPane.showMessageDialog(null, "La cifra es: " + cambioLibra(número));
				
			break;
				
		case "dólares":
			
			JOptionPane.showMessageDialog(null, "La cifra es: " + cambioDólar(número));
				
			break;
				
		case "yenes":
			
			JOptionPane.showMessageDialog(null, "La cifra es: " + cambioYenes(número));
	
			break;
				
		default:
				
			JOptionPane.showMessageDialog(null, "No has elegido una opción válida");
				
		}
		
	}
	
	// Cambio monedas (cálculo)
	
	public static double cambioLibra (int número) {
		
		final double camblibras = 0.86;
		
		double libras = número * camblibras;
		
		return libras;
		
	}
	
	public static double cambioDólar (int número) {
		
		final double cambdólares = 1.28611;
		
		double dólares = número * cambdólares;
		
		return dólares;
	}
		
	public static double cambioYenes (int número) {
			
		final double cambyenes = 0.86;
			
		double yenes = número * cambyenes;
			
		return yenes;

	}
	
}
