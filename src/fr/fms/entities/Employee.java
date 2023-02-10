package fr.fms.entities;

public class Employee extends Person {

	// attributs
	private String companyName;
	private String wage;

	// constructeurs
	public Employee(String lastName, String firstName) {
		super(lastName, firstName);
		// TODO Auto-generated constructor stub
	}

	// méthodes

	@Override
	public String toString() {
		return "Employee [companyName=" + companyName + ", wage=" + wage + "]";
	}

	// Accesseurs
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWage() {
		return wage;
	}

	public void setWage(String wage) {
		this.wage = wage;
	}

}
