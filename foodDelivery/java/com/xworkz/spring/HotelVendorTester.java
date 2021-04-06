package com.xworkz.spring;

import com.xworkz.spring.constant.HotelVendorType;
import com.xworkz.spring.entity.HotelVendorEntity;
import com.xworkz.spring.repositary.HotelVendorRepositary;
import com.xworkz.spring.repositary.HotelVendorRepositoryImpl;
import com.xworkz.spring.servicce.HotelVendorService;
import com.xworkz.spring.servicce.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {
		HotelVendorEntity entity = new HotelVendorEntity("Annapurna", "Jamkhandi", 4, 6363666671f,
				HotelVendorType.THREESTAR);
		HotelVendorRepositary hotelVendorRepositary = new HotelVendorRepositoryImpl();
		HotelVendorService hotelVendorService = new HotelVendorServiceImpl(hotelVendorRepositary);
		hotelVendorRepositary.save(entity);
	}

}
