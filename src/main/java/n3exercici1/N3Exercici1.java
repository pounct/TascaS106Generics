package n3exercici1;

public class N3Exercici1 {

	public static void main(String[] args) {

		Smartphone fone = new Smartphone();
		Generica.metodeTelefon(fone);
		Generica.metodeSmartphone(fone);

		Telefon fone2 = new Smartphone();
		Generica.metodeTelefon(fone2);
		
		// The method metode2(Smartphone) in the type Generica is not applicable for the
		// arguments (Telefon)

		// Generica.metode2(fone2);

		// pero se puede con el cast

		Generica.metodeSmartphone((Smartphone) fone2);

	}

}
