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

public class Payment {
    @Id
    int id;
    private String balanceCredit;
    private String creditLimit;
    private TypePayment typeCredits;
}
