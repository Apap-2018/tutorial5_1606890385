package com.apap.tutorial5.service;



import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial5.model.CarModel;

import com.apap.tutorial5.repository.CarDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDb carDb;
	
	@Override
	public void addCar(CarModel car) {
		// TODO Auto-generated method stub
		carDb.save(car);
	}
	
	@Override
	public Optional<CarModel> getCarDetailById(Long id) {
		// TODO Auto-generated method stub
		return carDb.findById(id);
	}

	@Override
	public void deleteCar(CarModel car) {
		// TODO Auto-generated method stub
		carDb.delete(car);
	}

	@Override
	public void updateCar(long id, CarModel car) {
		CarModel baru = carDb.getOne(id);
		baru.setBrand(car.getBrand());
		baru.setAmount(car.getAmount());
		baru.setPrice(car.getPrice());
		baru.setType(car.getType());
		carDb.save(baru);
		
		
	}


	
	

}
