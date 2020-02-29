package de.martcre.wf.repository;

import de.martcre.wf.dto.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
    List<Customer> findByLastName(String lastName);

}
