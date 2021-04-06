package com.xworkz.spring.servicce;

import com.xworkz.spring.entity.FoodItemEntity;
import com.xworkz.spring.repositary.FoodItemRepositary;

public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepositary itemRepository;

	public FoodItemServiceImpl(FoodItemRepositary itemRepository) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.itemRepository = itemRepository;

	}

	@Override
	public boolean ValidateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave");
		if (entity != null) {
			System.out.println("entity is valid");
			itemRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;

	}

}
