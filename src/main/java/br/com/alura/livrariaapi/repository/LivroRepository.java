package br.com.alura.livrariaapi.repository;

import br.com.alura.livrariaapi.dto.ItemLivrariaDto;
import br.com.alura.livrariaapi.modelo.Livro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LivroRepository extends JpaRepository<Livro, Long> {
    
//    @Query("select new br.com.alura.livrariaapi.dto.ItemLivrariaDto(a.nome, l.titulo) from Autor a, Livro l")
    
    @Query("select new br.com.alura.livrariaapi.dto.ItemLivrariaDto("
            + "l.autor.nome, count(*), round(count(*) * 1.0 / (select count(*) from Livro) * 100.0,1)    as percentual) "
            + " from Livro l group by l.autor order by percentual desc")
    public List<ItemLivrariaDto> relatorioLivrosPorAutor();
    
}
