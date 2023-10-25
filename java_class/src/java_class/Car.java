package java_class;

public class Car {

	// 멤버 변수
	private int speed;
	
	// 접근제어자
	// public: 같은클래스ㅇ, 같은 패키지ㅇ, 자식클래스ㅇ, 전체ㅇ
	// protected: 같은클래스ㅇ, 같은 패키지ㅇ, 자식클래스ㅇ
	// default: 같은클래스ㅇ, 같은 패키지ㅇ
	// private: 같은클래스ㅇ
	
	// 생성자
	// 클래스명과 동일해야함
	public Car(int speed) {
		this.speed = speed;
	}
	
	public void increaseSpeed(int speed) {
		this.speed = this.speed + speed;
	}

//	// setter 메소드
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	// getter 메소드
//	public int getSpeed() {
//		return this.speed;
//	}

	// 마우스 우클릭 -> source -> generate getters and setters 로 자동 생성 가능
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// 유효성 검사
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void start() {
		System.out.println("Car Start");
	}

}
