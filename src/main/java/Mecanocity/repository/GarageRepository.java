package Mecanocity.repository;

import org.springframework.data.repository.CrudRepository;

import Mecanocity.model.Car;

public interface GarageRepository extends CrudRepository <Car, Long> {
	
}
