package com.sbst.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sbst.entity.Customer;
import com.sbst.repository.CustomerRepository;
import com.sbst.service.CustomerService;
import com.sbst.viewmodel.CustomerViewModel;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerR;

	@Override
	public List<CustomerViewModel> getAllCustomer() {
		List<Customer> customers = customerR.findAll();
		List<CustomerViewModel> customersVM = new ArrayList<>();
		for (Customer c : customers) {
			customersVM.add(new CustomerViewModel(c));
		}
		return customersVM;
	}

}
