package br.com.alura.livrariaapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.time.LocalDate;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroFormDto {
    
    @NotBlank(message = "titulo não deve estar vazio / em branco")
    @Size(min = 10, message = "o titulo deve conter no minimo 10 caracteres")
    private String titulo;
    
    @PastOrPresent
    private LocalDate dataLancamento;
    
    @NotNull
    @Min(100)
    private int numeroPaginas;
    
    @NotBlank(message = "autor não deve estar vazio / em branco")
    private String autor;
    
    @JsonAlias("autor_id")
    private Long autorId;

}
