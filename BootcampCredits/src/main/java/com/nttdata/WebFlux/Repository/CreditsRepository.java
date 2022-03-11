package com.nttdata.WebFlux.Repository;

import com.nttdata.WebFlux.Modelo.Credits;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditsRepository extends ReactiveMongoRepository<Credits, Integer> {
}
