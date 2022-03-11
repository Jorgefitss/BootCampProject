package com.nttdata.Accountt.Repository;

import com.nttdata.Accountt.Modelo.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, Integer> {
}
