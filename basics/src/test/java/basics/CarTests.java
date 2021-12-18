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
		int distance = 1;
		
		int odometerBefore = bike.getOdometer();
		bike.drive(distance);
		int expectedOdometer = odometerBefore + distance;
		int actualOdometer = bike.getOdometer();
		
		assertEquals("the odometer should be incremented by the distance.", expectedOdometer, actualOdometer);
	}
}
