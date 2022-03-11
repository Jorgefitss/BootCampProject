package com.nttdata.Account.Services;

import com.nttdata.Account.Modelo.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface AccountService {
    Mono<Account> create(Account a);
    Mono<Account> findById(Integer id);
    Flux<Account> findAll();
    Mono<Account> update(Account a);
    Mono<Void> delete(Integer id);
}
