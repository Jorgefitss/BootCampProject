package com.nttdata.Customer.Services;

import com.nttdata.Customer.Modelo.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerServices {
    Mono<Customer> createCustom(Customer e);
    Mono<Customer> findById(Integer id);
    Flux<Customer> findAllCustom();
    Mono<Customer> updateCustom(Integer id, Customer e);
    Mono<Void> deleteCustom(Integer id);
}
