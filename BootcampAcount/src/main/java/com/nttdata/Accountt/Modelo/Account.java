package com.nttdata.Accountt.Modelo;

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
@Document

public class Account {
    @Id
    int id;
    private String name;
    private TypeAccount typeAccount;


}
