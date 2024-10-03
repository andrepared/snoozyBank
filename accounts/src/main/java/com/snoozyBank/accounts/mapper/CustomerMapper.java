package com.snoozyBank.accounts.mapper;

import com.snoozyBank.accounts.dto.AccountsDto;
import com.snoozyBank.accounts.dto.CustomerDto;
import com.snoozyBank.accounts.entity.Accounts;
import com.snoozyBank.accounts.entity.Customer;

public class CustomerMapper {

public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto){
    customerDto.setName(customer.getName());
    customerDto.setEmail(customer.getEmail());
    customerDto.setMobileNumber(customer.getMobileNumber());
    return customerDto;
}

public static Customer mapToCustomer(CustomerDto customerDto, Customer customer){
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customer.setMobileNumber(customerDto.getMobileNumber());
    return customer;
}

}
