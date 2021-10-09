
package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.LivroDto;
import br.com.alura.livrariaapi.dto.LivroFormDto;
import br.com.alura.livrariaapi.modelo.Livro;
import br.com.alura.livrariaapi.repository.LivroRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;
    ModelMapper modelMapper = new ModelMapper();
    
    public List<LivroDto> listar() {
        List<Livro> livros = livroRepository.findAll();
        return livros
                .stream()
                .map(l -> modelMapper.map(l, LivroDto.class))
                .collect(Collectors.toList());
    }
    
    @Transactional
    public void cadastrar(LivroFormDto dto) {
        Livro livro = modelMapper.map(dto, Livro.class);
        livro.setId(null);
        livroRepository.save(livro);
    }
    
}
