package prueba2;

public class Car {
	
	private String plate;
	private String brand;
	private String model;
	private String color;
	private float HorsePower;
	private float engineCapacity;
	
	
	public Car() {
		super();
		this.plate = "";
		this.brand = "";
		this.model = "";
		this.color = "";
		this.HorsePower = 0;
		this.engineCapacity = 0;
	}

	public Car(String plate, String brand, String model, String color, float HorsePower, float engineCapcity) {
		super();
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.HorsePower = HorsePower;
		this.engineCapacity = engineCapcity;
	}

	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public float getHorsePower() {
		return HorsePower;
	}

	public void setHorsePower(float HorsePower) {
		this.HorsePower = HorsePower;
	}

	
	public float getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapcity) {
		this.engineCapacity = engineCapcity;
	}

	
	@Override
	public String toString() {
		return "[Plate = " + plate + ", Brand = " + brand + ", Model = " + model
				+ ", Color = "+ color + ", Horse Power = " + HorsePower
				+ "HS, Engine Capacity = "+ engineCapacity + "cc]";
	}
}