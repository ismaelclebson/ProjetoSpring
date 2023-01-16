package br.com.Attornatus.cliente.http.controller;

import br.com.Attornatus.cliente.entity.Endereco;
import br.com.Attornatus.cliente.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EnderecoController {
    EnderecoRepository repository;

    @GetMapping("/endereco")
    public List<Endereco> getAllEndereco(){
        return repository.findAll();
    }

    @GetMapping("/endereco/{id}")
    public Endereco getEnderecoById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/endereco")
    public Endereco saveEndereco(@RequestBody Endereco endereco){
        return repository.save(endereco);
    }

    @DeleteMapping("/endereco/{id}")
    public void deleteEndereco(@PathVariable Long id){
        repository.deleteById(id);
    }
}
