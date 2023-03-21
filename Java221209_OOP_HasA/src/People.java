
public class People {
	String name;
	int age;
	Dog pet;
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public People(String name, int age, Dog pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		if (pet != null) {
			pet.printInfo();
		}
	}
}
