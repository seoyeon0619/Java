/**
 * here
 * @author seoyeon
 * name age print
 *
 */
public class Dog {
	String name;
	int age;
	
	public Dog() {
		
	}
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * name, age print
	 */
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
