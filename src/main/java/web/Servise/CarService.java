package web.Servise;

import web.Model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

	List<Car> carList = new ArrayList<>();

	public List<Car> list() {
		return carList;
	}

	Car car = new Car("Toyota",3,"Black");
	Car car1 = new Car("Mazda",3,"White");
	Car car2 = new Car("Mersedes",6,"Red");
	Car car3 = new Car("BMW",7,"Orange");
	Car car4 = new Car("Lada",0,"Brown");

	{
		carList.add(car);
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
	}

	public List<Car> getCar(int count) {
		List<Car> result = carList;
		result = result.subList(0,count);
		return result;
	}
}
