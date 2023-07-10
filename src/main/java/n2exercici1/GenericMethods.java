package n2exercici1;

public class GenericMethods {

	public static <T1, T2, T3> void imprimir(T1 element1, T2 element2, T3 element3) {

		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);

		System.out.println();
	}

	// un dels arguments del mètode genèric no sigui genèric.
	public static <T1, T2, T3> void imprimir2(T1 element1, String element2, T3 element3) {

		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);

		System.out.println();
	}

	// El paràmetre de tipus T2 no ha d'estar limitat pel tipus final String. Els
	// tipus finals no es poden ampliar més
	public static <T1, T2 extends String, T3> void imprimir3(T1 element1, T2 element2, T3 element3) {

		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);

		System.out.println();
	}
}
