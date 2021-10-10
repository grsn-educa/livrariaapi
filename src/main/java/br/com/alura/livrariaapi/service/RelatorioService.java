package br.com.alura.livrariaapi.service;

import br.com.alura.livrariaapi.dto.ItemLivrariaDto;
import br.com.alura.livrariaapi.repository.LivroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelatorioService {
    
    
    @Autowired
    private LivroRepository repository;
    
    public List<ItemLivrariaDto> relatorioLivrosPorAutor(){
        return repository.relatorioLivrosPorAutor();
    }
    
}
