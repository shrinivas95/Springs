package com.xworkz.spring.servicce;

import com.xworkz.spring.entity.CustomerEntity;
import com.xworkz.spring.repositary.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository cusRepository) {
		System.out.println("Invoked "+this.getClass().getSimpleName());
		this.customerRepository = cusRepository;
		
	}

	@Override
	public boolean ValidateAndSave(CustomerEntity entity) {
		System.out.println("Invoked ValidateAndSave ");
		if(entity != null) {
			System.out.println("Entity is valid");
			customerRepository.save(entity);
		}else {
			System.out.println("Entity is invalid");
		}
		return false;
	}

}
