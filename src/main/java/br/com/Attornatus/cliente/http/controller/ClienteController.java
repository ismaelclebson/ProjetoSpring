package br.com.Attornatus.cliente.http.controller;

import br.com.Attornatus.cliente.entity.Cliente;
import br.com.Attornatus.cliente.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClienteController {
    ClienteRepository repository;

    @GetMapping("/cliente")
    public List<Cliente> getAllClientes(){
        return repository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClinteById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/cliente")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable Long id){
        repository.deleteById(id);
    }
}
