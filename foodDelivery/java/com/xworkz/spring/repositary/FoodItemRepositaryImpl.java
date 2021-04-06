package com.xworkz.spring.repositary;

import com.xworkz.spring.entity.FoodItemEntity;

public class FoodItemRepositaryImpl implements FoodItemRepositary {

	@Override
	public void save(FoodItemEntity entity) {

		System.out.println("Invoked save "+entity);

	}

}
