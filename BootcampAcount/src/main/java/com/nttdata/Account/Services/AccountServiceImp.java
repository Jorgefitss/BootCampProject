package com.nttdata.Account.Services;

import com.nttdata.Account.Modelo.Account;
import com.nttdata.Account.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Mono<Account> create(Account a) {
        return accountRepository.save(a);
    }

    @Override
    public Mono<Account> findById(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public Flux<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Mono<Account> update(Account a) {
        return accountRepository.save(a);
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return accountRepository.deleteById(id);
    }
}
