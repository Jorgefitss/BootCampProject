package com.nttdata.Customer.Repository;

import com.nttdata.Customer.Modelo.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends ReactiveMongoRepository<Customer,Integer> {
}
