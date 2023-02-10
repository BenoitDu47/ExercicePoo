
public class Animal {

	private int nombrePattes;

	public int getNombrePattes() {
		return nombrePattes;
	}

	public void setNombrePattes(int nombrePattes) {
		this.nombrePattes = nombrePattes;
	}
	
	public void deplacer() {
		System.out.println("Je me déplace.");
	}

	public Animal() {
		
	}
	
	public Animal(int nombrePattes) {
		this.nombrePattes = nombrePattes;
	}

}
