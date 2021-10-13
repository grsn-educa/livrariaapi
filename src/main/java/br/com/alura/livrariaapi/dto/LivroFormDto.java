package br.com.alura.livrariaapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.time.LocalDate;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivroFormDto {
    
    @NotBlank
    @Size
    private String titulo;
    
    @PastOrPresent
    private LocalDate dataLancamento;
    
    @NotNull
    @Min(100)
    private int numeroPaginas;
    
    @NotBlank
    private String autor;
    
    @JsonAlias("autor_id")
    private Long autorId;

}
