package br.com.alura.livrariaapi.repository;

import br.com.alura.livrariaapi.dto.ItemLivrariaDto;
import br.com.alura.livrariaapi.modelo.Livro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LivroRepository extends JpaRepository<Livro, Long> {
    
    @Query("select new br.com.alura.livrariaapi.dto.ItemLivrariaDto(a.nome, l.titulo) from Autor a, Livro l")
    public List<ItemLivrariaDto> relatorioLivrosPorAutor();
    
    /*
    +-+-+-+-+-+-+-+-+-+-+
    |D|I|S|C|L|A|I|M|E|R|
    +-+-+-+-+-+-+-+-+-+-+

    SQL que retorna a pesquisa, não consegui colocar
    no @Query.

    select a.nome, count(l.id),round(count(l.autor_id) /(select  count(l.titulo) from livraria.livros l)* 100,1)
    from livraria.livros l, livraria.autores a 
    where l.autor_id = a.id 
    group by l.autor_id;
    */
    
}
