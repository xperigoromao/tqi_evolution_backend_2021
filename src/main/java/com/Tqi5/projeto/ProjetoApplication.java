package com.Tqi5.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Entity;
@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}
	@Entity
	public class Cadastro {
		public Long getCodigo_id() {
			return codigo_id;
		}
		private Long codigo_id;
	}
}















