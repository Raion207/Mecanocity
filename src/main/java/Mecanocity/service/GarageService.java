package Mecanocity.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mecanocity.model.Car;
import Mecanocity.repository.GarageRepository;

@Service 
public class GarageService {
	
	@Autowired
	private GarageRepository garageRepository;
	
	public List<Car> getCars(){
		List<Car> cars = new ArrayList<>();
		garageRepository.findAll().forEach(car -> {
			cars.add(car);
		});
		return cars;
	}

	public Car getCar(long id) {
		Object other;
		// return cars.stream().filter(car -> car.getId() == id).findFirst().orElse( (Car) (other = null));
		return garageRepository.findById(id).orElse((Car) (other = null));
	}

	public void deleteCar(long id) {
		// cars.removeIf(car -> car.getId() == id);		
		garageRepository.deleteById(id);
	}

	public void addCar(Car car) {
		// cars.add(car);
		garageRepository.save(car);
	}

	public void updateCar(Car car, long id) {
		/*cars.forEach(theCar -> {
			if (theCar.getId() == id) {
				cars.set(cars.indexOf(theCar), car);
			}
		});*/
		garageRepository.save(car);
	}
}
