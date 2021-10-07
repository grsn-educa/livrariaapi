
package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.LivroDto;
import br.com.alura.livrariaapi.dto.LivroFormDto;
import br.com.alura.livrariaapi.modelo.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    
    private List<Livro> livros = new ArrayList<>();
    ModelMapper modelMapper = new ModelMapper();
    
    public List<LivroDto> listar() {
        return livros
                .stream()
                .map(l -> modelMapper.map(l, LivroDto.class))
                .collect(Collectors.toList());
    }
    
    public void cadastrar(LivroFormDto dto) {
        Livro livro = modelMapper.map(dto, Livro.class);
        livros.add(livro);
    }
    
}
