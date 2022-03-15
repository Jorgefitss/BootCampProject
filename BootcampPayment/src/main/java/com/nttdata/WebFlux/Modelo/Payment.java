package com.nttdata.WebFlux.Modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("payment")

public class Payment {
    @Id
    int id;
    private String balanceCredit;
    private String creditLimit;
    private TypePayment typeCredits;
}
