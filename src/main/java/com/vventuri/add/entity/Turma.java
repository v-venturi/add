package com.vventuri.add.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "turma")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private int capacidade;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "escola_id")
    Escola escola;
}
