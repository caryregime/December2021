package basics;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		String model = "Corvette";
		
		Car car = new Car(model);
		car.Start();
		
		Assert.assertTrue(car != null);
	}
	
	@Test
	public void canDriveBicycle() {
		Bicycle bike = new Bicycle();
		driveVehicle(bike);
	}
	
	@Test
	public void canDriveCar() {
		Car car = new Car("Corvette");
		driveVehicle(car);
	}
	
	private void driveVehicle(Vehicle vehicle) {
		int distance = 1;
		
		int odometerBefore = vehicle.getOdometer();
		vehicle.drive(distance);
		int expectedOdometer = odometerBefore + distance;
		int actualOdometer = vehicle.getOdometer();
		
		assertEquals("the odometer should be incremented by the distance.", expectedOdometer, actualOdometer);
	}
}
