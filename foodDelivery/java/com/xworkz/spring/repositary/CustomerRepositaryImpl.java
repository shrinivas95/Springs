package com.xworkz.spring.repositary;

import com.xworkz.spring.entity.CustomerEntity;

public class CustomerRepositaryImpl implements CustomerRepository {

	@Override
	public void save(CustomerEntity entity) {

		System.out.println("invoked save" + entity);

	}

}
