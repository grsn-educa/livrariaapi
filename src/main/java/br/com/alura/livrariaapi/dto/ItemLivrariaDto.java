
package br.com.alura.livrariaapi.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class ItemLivrariaDto {
    
    private String autor;
    private Long quantidade;
    private Double percentual;
}
