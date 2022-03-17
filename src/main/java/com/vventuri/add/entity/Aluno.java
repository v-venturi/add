package com.vventuri.add.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "aluno")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    Date dataNascimento;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "turma_id")
    Turma turma;
}
