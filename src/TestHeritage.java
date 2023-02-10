
public class TestHeritage {

	
	public static void main(String[] args) {
		
		Animal monAnimal = new Animal();
		
		Animal monAnimal2 = new Animal(4);
		
		Animal boby = new Chien();
		
		Chat pitou = new Chat();
		
		Chat chocolat = new Chat(4, "Isabelle");
		
		Animal titi = new Oiseau();
		
		monAnimal.deplacer();
		
		System.out.println("Mon animal a " + monAnimal.getNombrePattes() + " pattes.");
		
		System.out.println("Mon animal2 a " + monAnimal2.getNombrePattes() + " pattes.");
		
		boby.deplacer();
		
		pitou.deplacer();
		
		System.out.println("Pitou a " + pitou.getNombrePattes() + " pattes.");
		
		System.out.println("Pitou est de race " + pitou.getRace() + ".");
		
		System.out.println("Chocolat a " + chocolat.getNombrePattes() + " pattes.");
		
		System.out.println("Chocolat est de race " + chocolat.getRace() + ".");
		
		titi.deplacer();
		
		
	}
}
