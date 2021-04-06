package com.xworkz.spring;

import com.xworkz.spring.entity.CustomerEntity;
import com.xworkz.spring.repositary.CustomerRepositaryImpl;
import com.xworkz.spring.repositary.CustomerRepository;
import com.xworkz.spring.servicce.CustomerService;
import com.xworkz.spring.servicce.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity entity = new CustomerEntity("Shrinivas", "Rajajinagar Bangalore", 5, 9900398143f,
				"shrinivas.xworkz@gmail.com", "male");
		CustomerRepository customerRepository1 = new CustomerRepositaryImpl();
		CustomerService service = new CustomerServiceImpl(customerRepository1);
		service.ValidateAndSave(entity);

	}

}
