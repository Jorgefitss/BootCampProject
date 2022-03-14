package com.nttdata.WebFlux.Services;

import com.nttdata.WebFlux.Modelo.Payment;
import com.nttdata.WebFlux.Repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PaymentServiceImp implements PaymentService {

    @Autowired
    PaymentRepository creditsRepository;

    @Override
    public Mono<Payment> createCredit(Payment e) {
        return creditsRepository.save(e);
    }

    @Override
    public Mono<Payment> findByCustomerId(Integer id) {
        return creditsRepository.findById(id);
    }

    @Override
    public Flux<Payment> findAllCredit() {
        return creditsRepository.findAll();
    }

    @Override
    public Mono<Payment> updateCredit(Payment c) {
        return creditsRepository.save(c);
    }

    @Override
    public Mono<Void> deleteCredit(Integer id) {
        return creditsRepository.deleteById(id);
    }
}
