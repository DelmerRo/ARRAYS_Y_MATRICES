package Ejercicios_Arrays_Matrices_UTN;

public class Eje3 {
	public static void main(String[] args) {
		int tama�oVector = 100;
		int[] enteros;
		enteros = new int[tama�oVector + 1];
		for (int i = 1; i <= tama�oVector; i++) {
			enteros[i] = (int) (Math.random() * (tama�oVector - 1) + 1);
			System.out.print("[" + enteros[i] + "]");
		}
		System.out.println("\n");
		////////////// Mostrar Minimo///////////
		int enteroMin = Integer.MAX_VALUE;
		for (int i = 1; i <= tama�oVector; i++) {
			if (enteros[i] < enteroMin) {
				enteroMin = enteros[i];
			}
		}
		System.out.println("Posiciones de minimo ");
		for (int i = 1; i <= tama�oVector; i++) {
			if (enteros[i] == enteroMin) {
				System.out.println("Posicion: " + i);
			}
		}
		System.out.println("\n Informe de elementos impares que ocupen Posicion Par");
		for (int i = 0; i < tama�oVector; i = i + 2) {
			if (enteros[i] % 2 != 0) {
				System.out.println("Producto: " + enteros[i]);
			}
		}
	}

}
