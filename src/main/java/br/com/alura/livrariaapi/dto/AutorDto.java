package br.com.alura.livrariaapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorDto {
	
        private Long id;
	private String nome;         
	private String email;        
	private String curriculo;

}
