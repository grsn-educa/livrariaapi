package br.com.alura.livrariaapi.repository;

import br.com.alura.livrariaapi.modelo.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {
    
}
