package java_class2;

abstract class Students {

	private String name;
	private String school;
	private int age;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	abstract public void todo();

	abstract public String introduce();

}

class Kim extends Students {
	
	public Kim(String name, String school, int age, int year) {
		super.setName(name);
		super.setSchool(school);
		super.setAge(age);
		super.setYear(year);
	}

	@Override
	public void todo() {
		System.out.println("점심은 김가네 김밥");
	}

	@Override
	public String introduce() {
		return "이름은 : " + getName() + ", 학교는 : " + getSchool() + ", 나이는 : " + getAge() + ", 학번은 : " + getYear();
	}
}

class Baek extends Students {

	@Override
	public void todo() {
		System.out.println("점심은 백종원 피자");
	}

	@Override
	public String introduce() {
		return "이름은 : " + getName() + ", 학교는 : " + getSchool() + ", 나이는 : " + getAge() + ", 학번은 : " + getYear();
	}
}

public class AbstractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kim kim = new Kim("김", "서울대", 22, 20);
		Baek baek = new Baek();

		kim.todo();
		System.out.println(kim.introduce());

		baek.setName("백");
		baek.setSchool("고려대");
		baek.setAge(21);
		baek.setYear(19);
		baek.todo();
		System.out.println(baek.introduce());
	}

}
