package com.nttdata.Accountt.Controller;


import com.nttdata.Accountt.Modelo.Account;
import com.nttdata.Accountt.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AccountController   {
    @Autowired
    AccountService accountService;

    @PostMapping("/create/account")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Account> create(@RequestBody Account account){
        return accountService.create(account);
    }

    @GetMapping(value = "/{id}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus
    public ResponseEntity<Mono<Account>> findById(@PathVariable("id") Integer id){
        Mono<Account> accountMono = accountService.findById(id);
        return new ResponseEntity<Mono<Account>>(accountMono,accountMono!=null? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getAll")
    @ResponseStatus
    public Flux<Account> findAll(){
        return accountService.findAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Mono<Account>> update(@RequestBody Account account){
        Mono<Account> accountMono = accountService.update(account);
        return new ResponseEntity<Mono<Account>>(accountMono, accountMono!=null? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Void> delete(@PathVariable("id") Integer id){
        return accountService.delete(id);
    }
}
