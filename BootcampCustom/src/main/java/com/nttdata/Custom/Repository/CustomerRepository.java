package com.nttdata.Custom.Repository;

import com.nttdata.Custom.Modelo.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends ReactiveMongoRepository<Customer,Integer> {
}
