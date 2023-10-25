package java_class2;

public class Vehicles {
	private int wheels;
	private int seats;
	private boolean hasEngine;
	
	public Vehicles(int wheels, int seats, boolean hasEngine){
		setWheels(wheels);
		setSeats(seats);
		setHasEngine(hasEngine);
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public boolean getHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public String aboutVehicle() {
		return "차량에 대한 정보 : ";
	}
}
