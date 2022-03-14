package com.nttdata.WebFlux.Services;

import com.nttdata.WebFlux.Modelo.Transaction;
import com.nttdata.WebFlux.Repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TransactionServiceImp implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Mono<Transaction> createTransaction(Transaction t) {
        return transactionRepository.save(t);
    }

    @Override
    public Mono<Transaction> updateTransaction(Transaction t) {
        return transactionRepository.save(t);
    }

    @Override
    public Mono<Transaction> findByTransactionId(Integer id) {
        return transactionRepository.findById(id);
    }

    @Override
    public Flux<Transaction> findAllByAccountId(Integer id) {
        return transactionRepository.findAll(Sort.by(String.valueOf(id)));
    }

    @Override
    public Mono<Void> deleteTransaction(Integer id) {
        return transactionRepository.deleteById(id);
    }
}
