package java_class2;

public class Motorcycle extends Vehicles{
	private String manufacturer;
	public Motorcycle(String manufacturer) {
		super(2, 1, true);
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
