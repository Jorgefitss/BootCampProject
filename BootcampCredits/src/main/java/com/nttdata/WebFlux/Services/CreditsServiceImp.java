package com.nttdata.WebFlux.Services;

import com.nttdata.WebFlux.Modelo.Credits;
import com.nttdata.WebFlux.Repository.CreditsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreditsServiceImp implements CreditsService {

    @Autowired
    CreditsRepository creditsRepository;

    @Override
    public Mono<Credits> createCredit(Credits e) {
        return creditsRepository.save(e);
    }

    @Override
    public Mono<Credits> findByCustomerId(Integer id) {
        return creditsRepository.findById(id);
    }

    @Override
    public Flux<Credits> findAllCredit() {
        return creditsRepository.findAll();
    }

    @Override
    public Mono<Credits> updateCredit(Credits c) {
        return creditsRepository.save(c);
    }

    @Override
    public Mono<Void> deleteCredit(Integer id) {
        return creditsRepository.deleteById(id);
    }
}
