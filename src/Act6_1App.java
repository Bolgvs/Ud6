import javax.swing.JOptionPane;

public class Act6_1App {
	
	public static void main (String [] args) {
	
			// Petición figura
	
			String figura = JOptionPane.showInputDialog(null, "¿De qué figura quieres calcular el área? (Triangulo, Cuadrado, Circulo)");
			
			// Condiciones:
			
			switch (figura) {
			
			case "Circulo":
				
				String texto_radio = JOptionPane.showInputDialog("¿Cuál es el radio?");
				
				int R = Integer.parseInt(texto_radio);
				
				JOptionPane.showMessageDialog(null, "El area del circulo es de: " + calculoAreaCi (R));
				
				break;
				
			case "Triangulo":
				
				String texto_base = JOptionPane.showInputDialog("¿Cuál es la base?");
				
				int base = Integer.parseInt(texto_base);
				
				String texto_altura = JOptionPane.showInputDialog("¿Cuál es la altura?");
				
				int altura = Integer.parseInt(texto_altura);
				
				JOptionPane.showMessageDialog(null, "El area del triangulo es de: " + calculoAreaT (base, altura));
				
				break;
				
			case "Cuadrado":
				
				String texto_lado = JOptionPane.showInputDialog("¿Cuál es el lado?");
				
				int lado = Integer.parseInt(texto_lado);
				
				JOptionPane.showMessageDialog(null, "El area del cuadrado es de: " + calculoAreaCu (lado));
				
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "No has escogido bien la figura");
				
	}
}
			
	// Cálculo de las áreas

	public static double calculoAreaCi (int R) {
		
		double area = Math.pow(R, 2) * Math.PI;
		
		return area;
		
	}
	
	public static double calculoAreaT (int base, int altura) {
		
		double area = (base*altura)/2;
		
		return area;
		
	}
	
	public static double calculoAreaCu (int lado) {
		
		double area = Math.pow(lado, 2);
		
		return area;
		
		
	}
	
	

}
