package java_class2;

public class Car extends Vehicles{
	private String manufacturer;
	public Car(String manufacturer) {
		super(4, 4, true);
		setManufacturer(manufacturer);
	}
	public void setManufacturer(String name) {
		this.manufacturer = name;
	}
	
	@Override
	public String aboutVehicle() {
		return super.aboutVehicle() + " " + getSeats() + "인승, 바퀴" + getWheels() + "개, 엔진 유무" + getHasEngine() + ", " + manufacturer + "산" ;
	}
}
