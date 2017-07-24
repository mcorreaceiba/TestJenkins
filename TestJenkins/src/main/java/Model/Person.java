package Model;

/**
 * @author moises.correa
 *
 */
public class Person {
	private int id;
	private String name;
	private int age;
	
	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public boolean isAdult(int age) {
		if (age <= 0) {
            throw new RuntimeException("La edad debe ser positiva");
		}
		if(age >= 18) {
			return true;
		}else {
			return false;	
		}
	}
	
}
