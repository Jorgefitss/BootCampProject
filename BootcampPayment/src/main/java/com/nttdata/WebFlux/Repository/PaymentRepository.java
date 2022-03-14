package com.nttdata.WebFlux.Repository;

import com.nttdata.WebFlux.Modelo.Payment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PaymentRepository extends ReactiveMongoRepository<Payment, Integer> {
}
