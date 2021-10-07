package br.com.alura.livrariaapi.controller;


import br.com.alura.livrariaapi.dto.LivroDto;
import br.com.alura.livrariaapi.dto.LivroFormDto;
import br.com.alura.livrariaapi.service.LivroService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    
    @Autowired
    private LivroService service;
//    @GetMapping
//    public Page<LivroDto> listar (@PageableDefault(size = 10) Pageable paginacao){
//        return service.listar(paginacao);
//    }
//    
//    @PostMapping
//    public ResponseEntity<LivroDto> cadastrar(@RequestBody @Valid LivroFormDto dto, UriComponentsBuilder uriBuilder){
//        LivroDto livroDto = service.cadastrar(dto);
//        URI uri = uriBuilder
//                .path("/livros/{id}")
//                .buildAndExpand(livroDto.getId())
//                .toUri();
//        return ResponseEntity.created(uri).body(livroDto);
//    }
    @GetMapping
    public List<LivroDto> listar(){
        return service.listar();
    }
    
    @PostMapping
    public void cadastrar(@RequestBody @Valid LivroFormDto dto){
        service.cadastrar(dto);
    }

}
