package br.com.alura.livrariaapi.modelo;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"nascimento","curriculo","email"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autores")
public class Autor {
    
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        private Long id;
	private String nome;
	private String email;
	private LocalDate nascimento;
	private String curriculo;

}// classe