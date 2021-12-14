package basics;

public class Car {
	private int odometer;
	public LargeEngine engine;
	public String model;

	public Car(String model) {
		this.model = model;
		this.engine = new LargeEngine();
	}
	
	int getOdometer() {
		return odometer;
	}

	public void Start() {
		this.engine.startEngine();		
	}
}
