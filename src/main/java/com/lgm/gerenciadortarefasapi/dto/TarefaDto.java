package com.lgm.gerenciadortarefasapi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TarefaDto {

    private int id;
    private String nome;
    private boolean concluida;
}
