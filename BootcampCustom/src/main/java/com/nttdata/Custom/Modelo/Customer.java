package com.nttdata.Custom.Modelo;

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
@Document("customer")

public class Customer {
    @Id
    int id;
    private String name;
    private String lastname;
    private Object products;
    private String typeCustom;
}
