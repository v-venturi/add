package com.vventuri.add.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "escola")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    @Embedded
    Endereco endereco;


}
