package com.sbst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sbst.common.Constants;
import com.sbst.service.CustomerService;
import com.sbst.viewmodel.CustomerViewModel;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerS;

	@GetMapping(Constants.CUSTOMER_PATH)
	public String get(Model model) {
		List<CustomerViewModel> customers = customerS.getAllCustomer();
		model.addAttribute("customers", customers);
		return Constants.CUSTOMER_VIEW;
	}
}
