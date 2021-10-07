package br.com.alura.livrariaapi.dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorFormDto {

    @NotBlank(message = "campo nome não deve estar nulo / vazio")
    private String nome;
    @NotBlank(message = "campo email não deve estar nulo / vazio")
    private String email;
    @PastOrPresent
    private LocalDate nascimento;
    @NotBlank(message = "campo curriculo não deve estar nulo / vazio")
    private String curriculo;

}
