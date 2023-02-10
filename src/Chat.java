
public class Chat extends Animal {

	private String race;

	public Chat() {
		super();
	}

	public Chat(int nombrePattes, String race) {
		super(nombrePattes);
		this.race = race;
	}

	public void deplacer() {
		System.out.println("Je marche.");
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
}
