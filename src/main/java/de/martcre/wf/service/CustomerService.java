package de.martcre.wf.service;

import de.martcre.wf.dto.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomer();
}
