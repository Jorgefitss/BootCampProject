package com.nttdata.Accountt.Services;

import com.nttdata.Accountt.Modelo.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface AccountService {
    Mono<Account> create(Account a);
    Mono<Account> findById(Integer id);
    Flux<Account> findAll();
    Mono<Account> update(Account a);
    Mono<Void> delete(Integer id);
}
