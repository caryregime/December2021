package basics.Vehicles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		String model = "Corvette";
		
		Car car = CarFactory.buildCarWithLargeEngine(model);

		canStartCar(car);
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
	
		ConvertibleCar convertibleCar = CarFactory.buildConvertibleCar(model);

		canStartCar(convertibleCar);
	}
	
	@Test
	public void canLowerAndRaiseConvertibleTop() {
		String model = "Miata";
		boolean isTopDown = false;
		
		ConvertibleCar convertible = new ConvertibleCar(model, new SmallEngine());
		isTopDown = convertible.isTopDown();
		
		assertFalse("the default position of top is up.", isTopDown);
		
		convertible.lowerTop();
		isTopDown = convertible.isTopDown();

		assertTrue("the top should be lowered.", isTopDown);
	}
	
	private void canStartCar(Car car) {
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
