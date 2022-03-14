package com.nttdata.WebFlux.Controller;

import com.nttdata.WebFlux.Modelo.Payment;
import com.nttdata.WebFlux.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Payment")

public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Payment> createCredit(@RequestBody Payment credits){return paymentService.createCredit(credits);}

    @GetMapping(value = "/getAll",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus
    public Flux<Payment> findAll(){
        return paymentService.findAllCredit();
    }

    @GetMapping("/{id}")
    @ResponseStatus
    public ResponseEntity<Mono<Payment>> findById(@PathVariable("id") Integer id){
        Mono<Payment> creditMono=paymentService.findByCustomerId(id);
        return new ResponseEntity<Mono<Payment>>(creditMono,creditMono != null? HttpStatus.OK:HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Mono<Payment>> updateCredit(@RequestBody Payment credits){
        Mono<Payment> creditMono = paymentService.updateCredit(credits);
        return new ResponseEntity<Mono<Payment>>(creditMono, creditMono!=null? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Void> deleteCredit(@PathVariable("id") Integer id){
        return paymentService.deleteCredit(id);
    }
}
