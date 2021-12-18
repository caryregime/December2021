package basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		String model = "Corvette";
		
		canBuildCar(model, new LargeEngine());
	}
	
	@Test
	public void canDriveBicycle() {
		Bicycle bike = new Bicycle();
		canDriveVehicle(bike);
	}
	
	@Test
	public void canDriveCar() {
		Car car = new Car("Corvette", new LargeEngine());
		canDriveVehicle(car);
	}

	@Test
	public void enginesHaveTheCorrectEngineSize() {
		int smallEngineCylinderCount = 4;
		int largeEngineCylinderCount = 8;
		
		SmallEngine smallEngine = new SmallEngine();
		LargeEngine largeEngine = new LargeEngine();
		
		int actualSmallEngineCylinderCount = smallEngine.getCylinderCount();
		int actualLargeEngineCylinderCount = largeEngine.getCylinderCount();
		
		assertTrue("cylinder counts should match as expected.", smallEngineCylinderCount == actualSmallEngineCylinderCount);
		assertTrue("cylinder counts should match as expected.", largeEngineCylinderCount == actualLargeEngineCylinderCount);
	}
	
	@Test
	public void canBuildConvertibleCar() {
		String model = "Miata";
	
		canBuildCar(model, new SmallEngine());
	}
	
	private void canBuildCar(String model, IEngine engine) {
		Car car = new Car(model, engine);
		car.Start();
		
		Assert.assertTrue(car != null);
	}
	
	private void canDriveVehicle(Vehicle vehicle) {
		int distance = 1;
		
		int odometerBefore = vehicle.getOdometer();
		vehicle.drive(distance);
		int expectedOdometer = odometerBefore + distance;
		int actualOdometer = vehicle.getOdometer();
		
		assertEquals("the odometer should be incremented by the distance.", expectedOdometer, actualOdometer);
	}
}
