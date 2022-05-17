package com.lgm.gerenciadortarefasapi.dao;

import com.lgm.gerenciadortarefasapi.model.Tarefa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {

    List<Tarefa> findAll();
}
