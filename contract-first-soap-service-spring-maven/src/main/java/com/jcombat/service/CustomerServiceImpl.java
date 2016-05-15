package com.jcombat.service;

import javax.jws.WebService;

import com.jcombat.ws.Customer;
import com.jcombat.ws.CustomerServicePortType;
import com.jcombat.ws.CustomerServiceRequestType;
import com.jcombat.ws.CustomerServiceResponseType;

@WebService(endpointInterface="com.jcombat.ws.CustomerServicePortType")
public class CustomerServiceImpl implements CustomerServicePortType {

	public CustomerServiceResponseType getCustomer(
			CustomerServiceRequestType customerServiceRequest) {
		final CustomerServiceResponseType response = new CustomerServiceResponseType();
		Customer customer = new Customer();
		customer.setId(123);
		customer.setName("Ramesh");
		response.getCustomer().add(customer);
		return response;
	}

}