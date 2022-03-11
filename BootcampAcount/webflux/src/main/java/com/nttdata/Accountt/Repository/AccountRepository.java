package com.nttdata.Accountt.Repository;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, ObjectId>{
}
