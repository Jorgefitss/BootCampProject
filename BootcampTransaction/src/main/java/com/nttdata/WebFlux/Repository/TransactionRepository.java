package com.nttdata.WebFlux.Repository;

import com.nttdata.WebFlux.Modelo.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, Integer> {
}
