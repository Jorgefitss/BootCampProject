package com.nttdata.Proj1.Services;

import com.nttdata.Proj1.Modelo.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerServices {
    void createCustom(Customer e);
    Mono<Customer> findById(Integer id);
    Flux<Customer> findAllCustom();
    Mono<Customer> updateCustom(Integer id, Customer e);
    Mono<Void> deleteCustom(Integer id);
}
