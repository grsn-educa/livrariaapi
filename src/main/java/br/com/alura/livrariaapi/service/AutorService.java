package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.AutorDto;
import br.com.alura.livrariaapi.dto.AutorFormDto;
import br.com.alura.livrariaapi.modelo.Autor;
import br.com.alura.livrariaapi.repository.AutorRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorService {
    
    @Autowired
    private AutorRepository autorRepository;
    ModelMapper modelMapper = new ModelMapper();

    public Page<AutorDto> listar(Pageable paginacao) {
    Page<Autor> autores = autorRepository.findAll(paginacao);
        return autores
                .map(a -> modelMapper
                .map(a, AutorDto.class));
    }
    
    @Transactional
    public void cadastrar(AutorFormDto dto) {
        Autor autor = modelMapper.map(dto, Autor.class);
        autor.setId(null);
        autorRepository.save(autor);
    }

}
