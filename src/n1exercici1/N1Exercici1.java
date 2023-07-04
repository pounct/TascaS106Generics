package n1exercici1;

public class N1Exercici1 {

	public static void main(String[] args) {

		NoGenericMethods metodeNG = new NoGenericMethods(new Objecte("objecte1"), new Objecte("objecte2"),
				new Objecte("objecte3"));

		metodeNG.extreure();

		metodeNG = new NoGenericMethods(new Objecte("objecte2"), new Objecte("objecte3"), new Objecte("objecte1"));

		metodeNG.extreure();

	}

}
