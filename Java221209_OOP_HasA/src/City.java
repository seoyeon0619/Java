
public class City {
	String name;
	int population;
	People people;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	
	
	public City(String name, int population, People people) {
		super();
		this.name = name;
		this.population = population;
		this.people = people;
	}



	public void printInfo() {
		System.out.println(name);
		System.out.println(population);
		people.printInfo();
	}
}
