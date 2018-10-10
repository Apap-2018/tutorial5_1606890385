package com.apap.tutorial5.service;
import java.util.Optional;


import com.apap.tutorial5.model.CarModel;
import com.apap.tutorial5.model.DealerModel;
import com.apap.tutorial5.repository.CarDb;

public interface CarService {
	void addCar(CarModel car);

	Optional<CarModel> getCarDetailById(Long id);

	void deleteCar(CarModel car);

	void updateCar(long id, CarModel car);
	

}

