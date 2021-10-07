package br.com.alura.livrariaapi.modelo;

import java.sql.Connection;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"nascimento","curriculo","email"})
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

	private String nome;
	private String email;
	private LocalDate nascimento;
	private String curriculo;

}// classe