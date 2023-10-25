package java_class2;

// 추상클래스
abstract class Animals {
	
	// 추상 메서드
	abstract public void sound();
	
	public void sleep() {
		System.out.println("동물이 잠을 잔다");
	}
}

// 추상클래스 Animals를 상속받는 Chicken클래스
class Chicken extends Animals {
	
	@Override
	public void sound() {
		System.out.println("꼬꼬댁");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상클래스는 인스턴스화 할 수 없음
		
		
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.sleep();
	}

}
