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
@Document("credits")

public class Credits {
    @Id
    int id;
    private String balanceCredit;
    private String creditLimit;
    private TypeCredits typeCredits;
}
