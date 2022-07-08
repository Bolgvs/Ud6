import javax.swing.JOptionPane;

public class Act6_12App {
	
	public static void main (String [] args) {
		
		// Pedimos las dimensiones del array
		
		String texto_tamaño = JOptionPane.showInputDialog("Indica las dimensiones del array");
		
		int tamaño = Integer.parseInt(texto_tamaño), M = 300, m = 1, número;
		
		int[] array = new int[tamaño];
		
		String texto_número = JOptionPane.showInputDialog("Indica el dígito final a recoger");
		
		número = Integer.parseInt(texto_número);
		
		// Funciones que llamamos
		
		aleatorios(array, m, M);
		
		decirNums(array, número);
	}
	
	// Para generar números aleatorios en el array
	
	public static void aleatorios (int[] array, int m, int M) {
		
		int bucle;
			
		for (bucle = 0; bucle < array.length; bucle++) {
			
			array[bucle] = (int) (Math.random() * (M - m - 1) + (m)) + 1;
		}
	}
	
	// Guardamos los números con la ultima cifra del número proporcionado por el usuario
	
	public static void decirNums (int[] array, int número) {
		
		int[] números = new int[array.length];
		
		int cuenta= 0;
		
		for (int bucle = 0; bucle < array.length; bucle++) {
			
			if (array[bucle] % 10 == número) {
				
				números[cuenta] = array[bucle];
				
				cuenta++;
			}
		}
		
		// Construimos este último for para evitar que salgan 0 en la respuesta
		
		for (int bucle = 0; bucle < números.length; bucle++) {
			
			if (números[bucle] != 0) {
				
				System.out.println(números[bucle]);				
			}
		}
	}

}