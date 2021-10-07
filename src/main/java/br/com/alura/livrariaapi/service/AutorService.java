package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.AutorDto;
import br.com.alura.livrariaapi.dto.AutorFormDto;
import br.com.alura.livrariaapi.modelo.Autor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private List<Autor> autores = new ArrayList<>();
    ModelMapper modelMapper = new ModelMapper();

    public List<AutorDto> listar() {
        return autores
                .stream().map(a -> modelMapper
                .map(a, AutorDto.class))
                .collect(Collectors.toList());
    }

    public void cadastrar(AutorFormDto dto) {
        Autor autor = modelMapper.map(dto, Autor.class);
        autores.add(autor);
    }

}
