import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestPerson {

	public static void main(String[] args) {

		Person manu = new Person("Macron", "Emmanuel", 45, "Elysee à Paris", new City("Amiens", "France"));
		Person poutin = new Person("Poutine", "Vladimir", 71);
		Person biden = new Person("Biden", "Joe");

//      Exercice 1.8 
//		System.out.println(manu);
//		System.out.println(poutin);
//		System.out.println(biden);		

		List<Person> Persons = Arrays.asList(
				new Person("Macron", "Emmanuel", 45, "Elysee à Paris", new City("Amiens", "France")),
				new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 200000000)),
				new Person("Johnson", "Boris", 56, "Dowing street à London", new City("New York", "Etats-unis")),
				new Person("Depardieu", "Gérad", 72, "Moscou", new City("Chateauroux", "France")),
				new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York", "Etats-unis")),
				new Person("Lawrence", "Jennifer", 30, "Lousville auwx USA", new City("Indian Hills", "USA"))
		);

//      Exercice 2.0 
		System.out.println("Liste des personnalités");
		for (Person c : Persons) {
			System.out.println(c);
		}
		System.out.println("------------------------------------------");
		System.out.println("Liste après notre filtre");
		
//		List<Person> personsInParis = Persons.stream().filter(Person -> Person.getAddress() == "Paris").collect(Collectors.toList());

		for (Person p : Persons) {
			String toto = p.getAddress();	
			boolean boolSearch1 = Stream.of(toto).anyMatch(s -> s.contains("Paris"));
			if (boolSearch1 == true)
				System.out.println(p);
		}
		
	}
}
