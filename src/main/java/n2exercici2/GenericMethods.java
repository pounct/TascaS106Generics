package n2exercici2;

import java.util.List;

public class GenericMethods {

	// els arguments del mètode genèric siguin una llista d'arguments de variable
	// indefinida.
	public static void imprimir(List<?> elements) {

		for (Object elem : elements) {

			System.out.println(elem);

		}

		System.out.println();
	}
	/*
	 * public static <T> void imprimir2(T[] elements) {
	 * 
	 * for (T elem : elements) {
	 * 
	 * System.out.println(elem);
	 * 
	 * }
	 * 
	 * System.out.println(); }
	 */

}
