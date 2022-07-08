import javax.swing.JOptionPane;

public class Act6_1App {
	
	public static void main (String [] args) {
		
		// Petición día de la semana
		
				String figura = JOptionPane.showInputDialog(null, "¿De qué figura quieres calcular el área?");
				
				// Condiciones:
				
				switch (figura) {
				
				case "Circulo":
					
					calculoAreaCi
					
					break;
		
	}
	
	public static void (String [] args) {
	
			// Petición figura
	
			String figura = JOptionPane.showInputDialog(null, "¿De qué figura quieres calcular el área?");
			
			// Condiciones:
			
			switch (figura) {
			
			case "Circulo":
				
				String texto_num = JOptionPane.showInputDialog("¿Cuál es el radio?");
				
				double num = Double.parseDouble(texto_num);
				
				resultado = calculoAreaCi (num)
				
				break;
				
}
	
	public static double calculoAreaCi (int R) {
		
		double resultado = Math.pow(R, 2) * Math.PI;
		
		System.out.println("El area del circulo es de: " + resultado);
		
	}
	
	public static void calculoAreaT (double base, double altura) {
		
		double resultado = (base*altura)/2;
		
		System.out.println("El area del triangulo es de: " + resultado);
		
	}
	
	public static void calculoAreaCu (double lado) {
		
		double resultado = Math.pow(lado, 2);
		
		System.out.println("El area del cuadrado es de: " + resultado);
		
		
	}
	
	

}
