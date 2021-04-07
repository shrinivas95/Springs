package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.constant.FoodType;
import com.xworkz.spring.constant.HotelVendorType;
import com.xworkz.spring.entity.CustomerEntity;
import com.xworkz.spring.entity.FoodItemEntity;
import com.xworkz.spring.entity.HotelVendorEntity;
import com.xworkz.spring.servicce.CustomerService;
import com.xworkz.spring.servicce.FoodItemService;
import com.xworkz.spring.servicce.HotelVendorService;

public class SpringTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("springconfig.xml");
		FoodItemService foodItemService = container.getBean(FoodItemService.class);
		FoodItemEntity entity = new FoodItemEntity("IddliVada", 50, FoodType.SOUTHINDIAN, 1, 20);
		foodItemService.ValidateAndSave(entity);

		CustomerEntity entity1 = new CustomerEntity("Shrinivas", "Rajajinagar Bangalore", 5, 9900398143f,
				"shrinivas.xworkz@gmail.com", "male");
		CustomerService customerService = container.getBean(CustomerService.class);
		customerService.ValidateAndSave(entity1);

		HotelVendorEntity entity2 = new HotelVendorEntity("Dhwaraka", "Jamkhandi", 4, 6363666671f,
				HotelVendorType.THREESTAR);
		HotelVendorService hotelVendorService = container.getBean(HotelVendorService.class);
		hotelVendorService.ValidateAndSave(entity2);
	}

}
