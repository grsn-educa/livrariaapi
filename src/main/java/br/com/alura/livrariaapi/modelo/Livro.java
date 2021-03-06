package br.com.alura.livrariaapi.modelo;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//@ToString(exclude = {"dataLancamento"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "livros")
public class Livro {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;
    @Column(name = "numero_paginas")
    private Integer numeroPaginas;
    private Integer quantidade;
    
    @ManyToOne
    private Autor autor;
    
    

    
}
