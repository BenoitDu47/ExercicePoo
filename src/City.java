/**
 * 
 * @author ThouryB
 *
 */
public class City {

	// attributs
	private String name;
	private String country;
	private Integer numberOfInhabitants;
	static int conteur = 0;

	// constructeurs
	public City(String name, String country, Integer numberOfInhabitants) {
		setName(name);
		setCountry(country);
		setNumberOfInhabitants(numberOfInhabitants);
		this.conteur ++;
	}
	
	public City(String name, Integer numberOfInhabitants) {
		setName(name);
		setCountry("unknown");
		setNumberOfInhabitants(numberOfInhabitants);
		this.conteur ++;
	}
	
	public City(String name, String country) {
		setName(name);
		setCountry(country);
		setNumberOfInhabitants(0);
		this.conteur ++;
	}
	
	public City() {
		this.name = "unknown";
		this.country = "unknown";
		this.numberOfInhabitants = 0;
		this.conteur ++;
	}
		
//		Exercice 1.1	
//		public void display() {
//			System.out.println("Nom de la ville : " + this.name + ", son paye : " + this.country
//					+ ", son nombre d’habitants : " + this.numberOfInhabitants);	
//		}

	// méthodes
//	public String toString() {
//			return "[Ville : " + this.name + "] [Paye : " + this.country
//				+ "] [Nombre d’habitants : " + this.numberOfInhabitants + "]";	
//	}
	
	
//	Exercice 1.6	
	@Override
	public String toString() {
		return "Ville de " + getName() + " en " + getCountry()
		+ " ayant " + getNumberOfInhabitants() + " d'habitants";	
}
	
	public String display() {
		return "Ville de " + getName() + " en " + getCountry()
			+ " ayant " + getNumberOfInhabitants() + " d'habitants";	
}
	
	// Accesseurs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getNumberOfInhabitants() {
		return numberOfInhabitants;
	}

	public void setNumberOfInhabitants(Integer numberOfInhabitants) {
		if (numberOfInhabitants < 0) {
			System.out.println("Le nombre d'habitants ne peut pas êtres négatif!");
			throw new RuntimeException("Le nombre d'habitants ne peut pas êtres négatif!");
		}
		this.numberOfInhabitants = numberOfInhabitants;
	}
	
	public static int getConteur() {
		return conteur;
	}

	public static void setConteur(int conteur) {
		City.conteur = conteur;
	}
}
