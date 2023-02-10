package fr.fms.entities;

public class Capital extends City {

	private String monument;

	@Override
	public String toString() {
		return super.toString() + " Capital [monument=" + monument + "]";
	}

	public Capital(String name, String country, Integer numberOfInhabitants, String monument) {
		super(name, country, numberOfInhabitants);
		this.monument = monument;
	}

	public Capital(String name, String country, Integer numberOfInhabitants) {
		super(name, country, numberOfInhabitants);
		setMonument("unknown");
	}

//	public Capital(String monument) {
//		setMonument(monument);
//	}

	public Capital() {
		setMonument("unknown");
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

}
