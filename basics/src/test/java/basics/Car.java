package basics;

public class Car extends Vehicle{
	public LargeEngine engine;
	public String model;

	public Car(String model) {
		this.model = model;
		this.engine = new LargeEngine();
	}
	
	public void Start() {
		this.engine.startEngine();		
	}
}
