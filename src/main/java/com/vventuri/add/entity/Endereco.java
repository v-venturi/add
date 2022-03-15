package com.vventuri.add.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

}
