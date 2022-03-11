package com.nttdata.WebFlux.Services;

import com.nttdata.WebFlux.Modelo.Credits;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditsService {
    Mono<Credits> createCredit(Credits e);
    Mono<Credits> findByCustomerId(Integer id);
    Flux<Credits> findAllCredit();
    Mono<Credits> updateCredit(Credits e);
    Mono<Void> deleteCredit(Integer id);
}
