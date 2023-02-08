import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TestCity {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<City> citys = new ArrayList<City>();

		City toulouse = new City("Toulouse", "France", 450000);
		City bordeaux = new City("Bordeaux", "France", 249712);
		City lyon = new City("Lyon", "France", 513275);
		City liverpool = new City("Liverpool", "Angleterre", 496784);
		City barcelone = new City("Barcelone", "Espagne", 1664180);
		City berlin = new City("Berlin", "Allemagne", 3748148);
		City rabat = new City("Rabat", 577000);

		citys.add(toulouse);
		citys.add(bordeaux);
		citys.add(lyon);
		citys.add(liverpool);
		citys.add(barcelone);
		citys.add(berlin);
		citys.add(rabat);

//      Exercice 1.1 
//		City toulouse = new City("Toulouse","France",450000);
//		City bordeaux = new City("Bordeaux","France",249712);
//		toulouse.display();
//		bordeaux.display();
//		lyon.display();
//		Fin Exercice 1 
//		System.out.println();
//		toulouse.numberOfInhabitants = Toulouse.numberOfInhabitants + 20000;
//		toulouse.display();

//		for (City c : citys) {
//			System.out.println(c);
//		}

		// Exercice 1.2
		// addOrRemoveResidents(scanner, citys);

		// Exercice 1.3
		// addCountryName(scanner, citys);

		// Exercice 1.4
		// System.out.println(toulouse.display());

		// Exercice 1.6
		// System.out.println(toulouse);
		
		// Exercice 1.7
//		int compt = 0;
//		for(City toto : citys) {
//			compt++;
//		}
//		
//		System.out.println("Le nombre de ville dans le programme est: " + City.conteur);
		

	}

	/**
	 * Method that allows to add the name of a country Exercice 1.3
	 * 
	 * @param scanner
	 * @param citys
	 */
	private static void addCountryName(Scanner scanner, ArrayList<City> citys) {
		char valeurLue = ' ';
		String newCountry = "";
		System.out.println("Souhaitez vous changez le paye de la ville de " + citys.get(6).getName() + "? O/N");
		valeurLue = scanner.next().charAt(0);
		if (valeurLue == 'O') {
			System.out.println("Entrez le nom du du paye?");
			newCountry = scanner.next();
			citys.get(6).setCountry(newCountry);
			System.out.println(citys.get(6).toString());
		}
	}

	/**
	 * The method to remove or add inhabitants Exercice 1.2
	 * 
	 * @param scanner
	 * @param citys
	 */
	private static void addOrRemoveResidents(Scanner scanner, ArrayList<City> citys) {
		char valeurLue = ' ';
		System.out.println(
				"Souhaitez vous suprimer ou ajouter des habitants a la ville de " + citys.get(0).getName() + "? -/+");
		valeurLue = scanner.next().charAt(0);
		if (valeurLue == '-') {
			System.out.println("Combien d'habitants Souhaitez vous suprimer?");
			int livingLess = scanner.nextInt();
			citys.get(0).setNumberOfInhabitants(citys.get(0).getNumberOfInhabitants() - livingLess);
			System.out.println(
					"Nombre d'habitants à " + citys.get(0).getName() + ": " + citys.get(0).getNumberOfInhabitants());
		} else if (valeurLue == '+') {
			System.out.println("Combien d'habitants Souhaitez vous ajouter?");
			int livingInMore = scanner.nextInt();
			citys.get(0).setNumberOfInhabitants(citys.get(0).getNumberOfInhabitants() + livingInMore);
			System.out.println(
					"Nombre d'habitants à " + citys.get(0).getName() + ": " + citys.get(0).getNumberOfInhabitants());
		}
	}
	
	
}
