package java_class2;

public class Animal {
	private String type;
	private String name;
	private int age;
	
	public Animal(String type, String name, int age) {
		setType(type);
		setName(name);
		setAge(age);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public void makeSound() {
		System.out.println("동물은 소리를 낸다");
	}
}

