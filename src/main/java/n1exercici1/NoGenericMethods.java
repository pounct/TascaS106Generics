package n1exercici1;



public class NoGenericMethods {
	private Objecte objecte1;
	private Objecte objecte2;
	private Objecte objecte3;
	
	
	//(Objecte objecte1, Objecte objecte2, Objecte objecte3)
	//(Objecte objecte2, Objecte objecte1, Objecte objecte3)
	//(Objecte objecte2, Objecte objecte3, Objecte objecte1)
	public NoGenericMethods(Objecte objecte1, Objecte objecte2, Objecte objecte3) {
		
		this.objecte1 = objecte1;
		this.objecte2 = objecte2;
		this.objecte3 = objecte3;
	}

	public void emmagatzemar(Objecte objecte1,Objecte objecte2,Objecte objecte3) {
		
		this.objecte1 = objecte1;
		this.objecte2 = objecte2;
		this.objecte3 = objecte3;
		
	}
	
	public void extreure() {
		
		System.out.println(objecte1+" "+objecte2+" "+objecte3); 
		
	}
}
