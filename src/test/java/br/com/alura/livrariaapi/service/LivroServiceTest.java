package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.LivroDto;
import br.com.alura.livrariaapi.dto.LivroFormDto;
import br.com.alura.livrariaapi.repository.AutorRepository;
import br.com.alura.livrariaapi.repository.LivroRepository;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LivroServiceTest {

    @Mock
    private LivroRepository livroRepository;

    @Mock
    private AutorRepository autorRepository;

    @InjectMocks
    private LivroService service;

    @Test
    void deveriaCadastrarUmLivro() {
        LivroFormDto formDto = new LivroFormDto(
                "Aprenda Python em 21 dias",
                LocalDate.now(),
                142,
                "Andre da Silva",
                1l
        );

        LivroDto dto = service.cadastrar(formDto);
        assertEquals(formDto.getTitulo(), dto.getTitulo());
        assertEquals(formDto.getDataLancamento(), dto.getDataLancamento());
        assertEquals(formDto.getNumeroPaginas(), dto.getNumeroPaginas());
        assertEquals(formDto.getAutor(), dto.getAutor());
    }

}
