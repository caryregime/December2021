package basics;

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
}
