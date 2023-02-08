/**
 * 
 * @author ThouryB
 *
 */
public class Person extends City {

	// attributs
	private String lastName;
	private String firstName;
	private Integer age;
	private String address;
	private City bornCity;

	// constructeurs
	public Person(String lastName, String firstName, Integer age, String address, City birthTown) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.bornCity = birthTown;
	}

	public Person(String lastName, String firstName, Integer age) {
		setlastName(lastName);
		setFirstName(firstName);
		setAge(age);
		this.address = "unknown";
	}

	public Person(String lastName, String firstName) {
		setlastName(lastName);
		setFirstName(firstName);
		setAge(0);
		this.address = "unknown";
	}

	// méthodes
	
//  Exercice 1.8	
//	public String toString() {
//		return "Person [lastName=" + getlastName() + ", firstName=" + getFirstName() + ", age=" + getAge()
//				+ ", address=" + getAddress() + "] Né " + this.bornCity;
//	}
	
	@Override
	public String toString() {
		return getlastName() + ", " + getFirstName() + ", " + getAge()
				+ "ans, Habitant " + getAddress() + ", Né dans la " + this.bornCity;
	}

	// Accesseurs
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
