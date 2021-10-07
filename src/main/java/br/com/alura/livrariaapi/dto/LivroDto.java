package br.com.alura.livrariaapi.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroDto {
    
    private Long id;
    private String titulo;
    private LocalDate dataLancamento;
    private int numeroPaginas;
    private String autor;
}
