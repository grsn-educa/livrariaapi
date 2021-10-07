package br.com.alura.livrariaapi.modelo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString(exclude = {"dataLancamento"})
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    
    private String titulo;
    private LocalDate dataLancamento;
    private int numeroPaginas;
    private String autor;
    
}
