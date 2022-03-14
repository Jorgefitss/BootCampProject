package com.nttdata.WebFlux.Modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Transaction {
    @Id
    int id;
    Float amount;
    String date;
    TypeTransaction typeTransaction;
}
