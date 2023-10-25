package java_class2;

public class Person extends Object {
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
        return "Person / name : " + name + ", age : " + age;
    }
	
	// 오버로딩
	public String toString(int age) {
        return "Person / name : " + name + ", age : " + age;
    }
	
}
