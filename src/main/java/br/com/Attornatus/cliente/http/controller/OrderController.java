package br.com.Attornatus.cliente.http.controller;

import br.com.Attornatus.cliente.dto.OrderRequest;
import br.com.Attornatus.cliente.entity.Cliente;
import br.com.Attornatus.cliente.repository.ClienteRepository;
import br.com.Attornatus.cliente.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private ClienteRepository cr;
    @Autowired
    private EnderecoRepository er;

    @PostMapping("/cliente")
    public Cliente saveCliente(@RequestBody OrderRequest request){
        return cr.save(request.getCliente());
    }
    @GetMapping("/cliente")
    public List<Cliente> findAllOrders(){
        return cr.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente findById(Long id){
        return cr.findById(id).get();
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(Long id){
        cr.deleteById(id);
    }

    

}
