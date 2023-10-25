package java_interface;

interface Controller {
	abstract public void powerOn();
	abstract public void powerOff();
	default public void display() {
		System.out.println("디스플레이가 켜졌습니다");
	}
}

class TV implements Controller {

	@Override
	public void powerOn() {
		System.out.println("TV power ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV power OFF");
	}

}

class Computer implements Controller {

	@Override
	public void powerOn() {
		System.out.println("Computer power ON");
	}

	@Override
	public void powerOff() {
		System.out.println("Computer power OFF");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer computer = new Computer();
		
		tv.powerOn();
		tv.display();
		tv.powerOff();
		computer.powerOn();
		computer.display();
		computer.powerOff();
	}

}
