package n3exercici1;

public class Generica {

	public static <T extends Telefon> void metodeTelefon(Telefon fone) {

		System.out.println("LLamada del metode limitat per la interfície Telefon");

		System.out.println("Telefon fone { fone.getClass() }: --->   " + fone.getClass());

		// The method ferFotos() is undefined for the type Telefon

		// fone.ferFotos();

		// pero se puede con el cast

		System.out.println("LLamada del metode ferFotos() per el metode limitat per la interfície Telefon");
		System.out.println("After Adding cast");
		((Smartphone) fone).ferFotos();
	}

	public static <S extends Smartphone> void metodeSmartphone(Smartphone fone) {

		System.out.println("LLamada del metode  limitat per la classe Smartphone");

		System.out.println("Smartphone fone { fone.getClass() }:  --->    " + fone.getClass());

		// The method ferFotos() is defined for the type Smartphone
		System.out.println("LLamada del metode ferFotos() per el metode limitat per la classe Smartphone");
		fone.ferFotos();
	}

}
