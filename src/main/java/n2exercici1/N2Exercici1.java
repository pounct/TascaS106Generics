package n2exercici1;

public class N2Exercici1 {

	public static void main(String[] args) {

		// imprimir2 imprimir2(T1, String, T3)
		// el segundo tipo del elemento tiene que ser String
		GenericMethods.imprimir2(new Persona("UN OBJECTE", "Persona", 18), "Un String", 123);

		// impresion sin problema
		System.out.println("impresion sin problema...");

		// si entramos un Float en lugar de un String por ejemplo no lo admite
		// The method imprimir2(T1, String, T3) in the type GenericMethods is not
		// applicable for the arguments (Persona, float, int)

		// GenericMethods2.imprimir2(new Persona("UN OBJECTE", "Persona", 18), 10.2F,
		// 123);

		GenericMethods.imprimir3(new Persona("UN OBJECTE", "Persona", 18), "Un String", 123);

		// Bound mismatch: The generic method imprimir3(T1, T2, T3) of type
		// GenericMethods is not applicable for the arguments (Persona, Float, Integer).
		// The inferred type Float is not a valid substitute for the bounded parameter
		// <T2 extends String>
		// GenericMethods.imprimir3(new Persona("UN OBJECTE", "Persona", 18), 10.2F, 123);

	}

}
