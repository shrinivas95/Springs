package com.xworkz.spring;

import com.xworkz.spring.constant.FoodType;
import com.xworkz.spring.entity.FoodItemEntity;
import com.xworkz.spring.repositary.FoodItemRepositary;
import com.xworkz.spring.repositary.FoodItemRepositaryImpl;
import com.xworkz.spring.servicce.FoodItemService;
import com.xworkz.spring.servicce.FoodItemServiceImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		FoodItemEntity entity = new FoodItemEntity("FrideRice", 70, FoodType.SOUTHINDIAN, 1, 20);
		FoodItemRepositary foodItemRepositary = new FoodItemRepositaryImpl();
		FoodItemService foodItemService = new FoodItemServiceImpl(foodItemRepositary);
		foodItemService.ValidateAndSave(entity);

	}

}
