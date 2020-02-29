package de.martcre.wf.service;

import de.martcre.wf.dto.Customer;
import de.martcre.wf.repository.CustomerRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Log
public class CustomerServiceImpl implements CustomerService, Serializable {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomer() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }


}
