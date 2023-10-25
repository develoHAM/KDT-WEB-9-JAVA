package java_interface;

abstract class VehiclePrac {
	private String name;
	private int maxSpeed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	abstract void move();
}

interface FlyablePrac {
	void fly();
}

class CarPrac extends VehiclePrac {
	
	public CarPrac() {
		setName("현대");
		setMaxSpeed(399);
	}

	@Override
	public void move() {
		System.out.println("도로를 따라 이동중");
	}
}

class AirplanePrac extends VehiclePrac implements FlyablePrac {
	
	public AirplanePrac(){
		setName("보잉");
		setMaxSpeed(100000);
	}
	@Override
	public void fly() {
		System.out.println("고도 10,000피트에서 비행 중");
	}

	@Override
	public void move() {
		System.out.println("하늘을 날아가는중");
	}

}

public class FinalPractice {

	public static void main(String[] args) {

		CarPrac car = new CarPrac();
		AirplanePrac plane = new AirplanePrac();

		VehiclePrac[] vehicless = { car, plane };

		for (VehiclePrac v : vehicless) {
			System.out.println("이름: " + v.getName());
			System.out.println("최대속도: " + v.getMaxSpeed());
			v.move();
			
			// instanceof: 객체가 특정 클래스나 인터페이스의 인스턴스인지 확인하는 연산자, boolean 반환
			if (v instanceof FlyablePrac) {
				((FlyablePrac) v).fly();
			}

		}
	}

}
