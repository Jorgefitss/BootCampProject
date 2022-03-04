package com.nttdata.Proj1.Services;

import com.nttdata.Proj1.Modelo.Customer;
import com.nttdata.Proj1.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServicesImp implements CustomerServices {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void createCustom(Customer e) {
        customerRepository.save(e).subscribe();}

    @Override
    public Mono<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public Flux<Customer> findAllCustom() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> updateCustom( Integer id , Customer e ) {
        return customerRepository.save(e);
    }

    @Override
    public Mono<Void> deleteCustom(Integer id) {
        return customerRepository.deleteById(id);
    }
}
