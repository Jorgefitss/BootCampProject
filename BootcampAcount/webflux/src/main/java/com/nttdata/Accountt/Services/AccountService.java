package com.nttdata.Accountt.Services;

import com.nttdata.Accountt.Modelo.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public interface AccountService {
    Flux<Account> findAll();
    Mono<Account> findById(String id);
    Flux<Account> findByCustomName(String name);
    Mono<Account> delete(String id);
}
