//package com.example.easy.logistics.backend;
//
//import java.util.UUID;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.example.easy.logistics.backend.models.Estoque;
//import com.example.easy.logistics.backend.repository.EstoqueRepository;
//
//import reactor.core.publisher.Flux;
//
//@Component
//public class DummyData implements CommandLineRunner {
//
//	private final EstoqueRepository estoqueRepository;
//
//	DummyData(EstoqueRepository estoqueRepository) {
//		this.estoqueRepository = estoqueRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		estoqueRepository.deleteAll()
//				.thenMany(Flux.just("Alface", "Carne", "Tomate", "Refrigerante 350ML", "Batata")
//				.map(nome -> new Estoque(/*UUID.randomUUID().toString()*/ "1", nome, 0)).flatMap(estoqueRepository::save))
//				.subscribe(System.out::println);
//	}
//}
