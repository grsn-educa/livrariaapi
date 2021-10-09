package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.AutorDto;
import br.com.alura.livrariaapi.dto.AutorFormDto;
import br.com.alura.livrariaapi.modelo.Autor;
import br.com.alura.livrariaapi.repository.AutorRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    private AutorRepository autorRepository;
    ModelMapper modelMapper = new ModelMapper();

    public List<AutorDto> listar() {
    List<Autor> autores = autorRepository.findAll();
        return autores
                .stream().map(a -> modelMapper
                .map(a, AutorDto.class))
                .collect(Collectors.toList());
    }

    public void cadastrar(AutorFormDto dto) {
        Autor autor = modelMapper.map(dto, Autor.class);
        autorRepository.save(autor);
    }

}
