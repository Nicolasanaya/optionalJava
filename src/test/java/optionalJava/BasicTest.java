package optionalJava;

import org.junit.jupiter.api.Assumptions;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import juanonlab.tests.optional.Car;
import juanonlab.tests.optional.Utils;

class BasicTest {
	
	@Test
	void checkCarBuild() {		
		Car car = new Car("Opel Corsa");
		car.setTyre(Optional.of(Utils.buildDTyre("Dunlop Sport", 2017, "A")));
		Optional<Car> theCar = Optional.of(car);	
		Assumptions.assumeTrue(theCar.isPresent());		
	}
}
