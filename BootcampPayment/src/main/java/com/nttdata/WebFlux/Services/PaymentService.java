package com.nttdata.WebFlux.Services;

import com.nttdata.WebFlux.Modelo.Payment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentService {
    Mono<Payment> createCredit(Payment e);
    Mono<Payment> findByCustomerId(Integer id);
    Flux<Payment> findAllCredit();
    Mono<Payment> updateCredit(Payment e);
    Mono<Void> deleteCredit(Integer id);
}
