
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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;
    ModelMapper modelMapper = new ModelMapper();
    
    public Page<LivroDto> listar(Pageable paginacao) {
        Page<Livro> livros = livroRepository.findAll(paginacao);
        return livros
                .map(l -> modelMapper
                .map(l, LivroDto.class));
    }
    
    @Transactional
    public LivroDto cadastrar(LivroFormDto dto) {
        Livro livro = modelMapper.map(dto, Livro.class);
        livro.setId(null);
        livroRepository.save(livro);
        return modelMapper.map(livro, LivroDto.class);
    }
    
}
