package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		
		
		Capital Paris = new Capital("Paris", "France", 2240000, "Tour Eiffel");
		City bordeaux = new City("Bordeaux", "France", 249712);
		City lyon = new City("Lyon", "France", 513275);
		City liverpool = new City("Liverpool", "Angleterre", 496784);
		Capital barcelone = new Capital("Barcelone", "Espagne", 1664180, "sagrada familia");
		City berlin = new Capital("Berlin", "Allemagne", 3748148, "porte de brandebourg");
//		City rabat = new Capital("Tour Hassan");

		
		System.out.println(Paris);
		System.out.println(barcelone);
		
	}
}
