package com.nttdata.Custom.Controller;

import com.nttdata.Custom.Modelo.Customer;
import com.nttdata.Custom.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
//@RequestMapping("/custom")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping("/create/custom")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Customer> customerServices(@RequestBody Customer customer){
        return customerServices.createCustom(customer);
    }

    @GetMapping(value = "/get/all",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<Customer> findAllCustom(){

        return customerServices.findAllCustom();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public ResponseEntity<Mono<Customer>> findById(@PathVariable("id") Integer id){
        Mono<Customer> customerMono = customerServices.findById(id);
        return new ResponseEntity<Mono<Customer>>(customerMono,customerMono != null? HttpStatus.OK:HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Mono<Customer>> updateCustomerById(@PathVariable("id") Integer id, @RequestBody Customer customer){
        Mono<Customer> customerMono = customerServices.updateCustom( id, customer);
        return new ResponseEntity<Mono<Customer>>(customerMono,customerMono != null ? HttpStatus.OK: HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Void> deleteCustom(@PathVariable("id") Integer id){

        return customerServices.deleteCustom(id);
    }


}
