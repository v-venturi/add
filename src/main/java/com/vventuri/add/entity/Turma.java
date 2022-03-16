package com.vventuri.add.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity(name = "turma")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turma {
    private int id;
    private String nome;
    private int capacidade;
}
