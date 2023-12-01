package com.example.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/customer")
public class CustomerController {
	@GetMapping(path="/getCustomer")
	public String getCustomer()
	{
		return "Customer name is james";
	}
}
