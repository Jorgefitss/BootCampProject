package com.nttdata.WebFlux.Controller;

import com.nttdata.WebFlux.Modelo.Credits;
import com.nttdata.WebFlux.Services.CreditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController

public class CreditsController {
    @Autowired
    private CreditsService creditService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Credits> createCredit(@RequestBody Credits credits){return creditService.createCredit(credits);}

    @GetMapping(value = "/getAll",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus
    public Flux<Credits> findAll(){
        return creditService.findAllCredit();
    }

    @GetMapping("/{id}")
    @ResponseStatus
    public ResponseEntity<Mono<Credits>> findById(@PathVariable("id") Integer id){
        Mono<Credits> creditMono=creditService.findByCustomerId(id);
        return new ResponseEntity<Mono<Credits>>(creditMono,creditMono != null? HttpStatus.OK:HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Mono<Credits>> updateCredit(@RequestBody Credits credits){
        Mono<Credits> creditMono = creditService.updateCredit(credits);
        return new ResponseEntity<Mono<Credits>>(creditMono, creditMono!=null? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Void> deleteCredit(@PathVariable("id") Integer id){
        return creditService.deleteCredit(id);
    }
}
