package java_class2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person(슈퍼클래스) 인스턴스 생성
		Person person = new Person("홍길동", 30);
		System.out.println(person.toString());
		System.out.println(person.toString(50));
		
		// Student(하위클래스) 인스턴스 생성
		Student student = new Student("이몽룡", 34,"컴퓨터 공학");
		System.out.println(student.toString());
		
		// 하위클래스에 부모 클래스의 메서드 사용
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		Cat cat = new Cat("참깨", 8);
		Dog dog = new Dog("로이", 2);
		cat.makeSound();
		dog.makeSound();
		
		Bus bus = new Bus("대우");
		System.out.println(bus.aboutVehicle());
		Bicycle bicycle = new Bicycle("Honda");
		System.out.println(bicycle.aboutVehicle());
		Car car = new Car("BMW");
		System.out.println(car.aboutVehicle());
		

	}

}
