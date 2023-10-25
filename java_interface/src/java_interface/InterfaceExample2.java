package java_interface;

interface Move {
	void moveForward();

	void moveBackward();
}

interface Power {
	void powerOn();

	void powerOff();
}

// 인터페이스는 인터페이스를 상속 받을 수 있음
// 다중 상속이 가능
interface Car extends Move, Power {
	void changeGear(int gear);
}

class SUV implements Car {

	@Override
	public void moveForward() {
		System.out.println("FORWARD");
	}

	@Override
	public void moveBackward() {
		System.out.println("BACKWARD");
	}

	@Override
	public void powerOn() {
		System.out.println("CAR START");
	}

	@Override
	public void powerOff() {
		System.out.println("CAR STOP");
	}

	@Override
	public void changeGear(int gear) {
		System.out.println("CHANGE GEAR: " + gear);
	}

}

public class InterfaceExample2 {
	public static void main(String[] args) {
		SUV mySUV = new SUV();
		
		mySUV.powerOn();
		mySUV.changeGear(5);
		mySUV.moveForward();
	}
}
