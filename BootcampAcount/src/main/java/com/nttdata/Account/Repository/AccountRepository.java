package com.nttdata.Account.Repository;

import com.nttdata.Account.Modelo.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, Integer> {
}
