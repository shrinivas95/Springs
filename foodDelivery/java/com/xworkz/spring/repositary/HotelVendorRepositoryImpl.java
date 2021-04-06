package com.xworkz.spring.repositary;

import com.xworkz.spring.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepositary {

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("Invoked save");

	}

}
