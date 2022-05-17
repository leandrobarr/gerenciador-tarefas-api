package com.lgm.gerenciadortarefasapi;

import com.lgm.gerenciadortarefasapi.dao.TarefaRepository;
import com.lgm.gerenciadortarefasapi.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@SpringBootApplication
public class GerenciadorTarefasApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(GerenciadorTarefasApiApplication.class, args);
	}

//	@Autowired
//	private TarefaRepository tarefaRepository;
//
//	@Bean
//	public CommandLineRunner carregarData() {
//
//		return args -> {
//			tarefaRepository.save(new Tarefa(1, "Tarefa1", true, Instant.now(), Instant.now()));
//			tarefaRepository.save(new Tarefa(2, "Tarefa2", true, Instant.now(), Instant.now()));
//			tarefaRepository.save(new Tarefa(3, "Tarefa3", true, Instant.now(), Instant.now()));
//		};
//	}
}
