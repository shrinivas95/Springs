package com.xworkz.spring.servicce;

import com.xworkz.spring.entity.HotelVendorEntity;
import com.xworkz.spring.repositary.HotelVendorRepositary;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepositary hotelVendorRepositary;

	public HotelVendorServiceImpl(HotelVendorRepositary hotelVendorRepositary) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.hotelVendorRepositary = hotelVendorRepositary;

	}

	@Override
	public boolean ValidateAndSave(HotelVendorEntity entity) {
		System.out.println("Invoked ValidateAndSave");
		if (entity != null) {
			System.out.println("Entity Valid");
			hotelVendorRepositary.save(entity);
		} else {
			System.out.println("Entity invalid");
		}
		return false;
	}

}
