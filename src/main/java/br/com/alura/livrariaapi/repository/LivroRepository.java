package br.com.alura.livrariaapi.repository;

import br.com.alura.livrariaapi.dto.ItemLivrariaDto;
import br.com.alura.livrariaapi.modelo.Livro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LivroRepository extends JpaRepository<Livro, Long> {
    
    @Query("select new br.com.alura.livrariaapi.dto.ItemLivrariaDto(a.nome) from Autor a")
    public List<ItemLivrariaDto> relatorioLivrosPorAutor();
    
}
