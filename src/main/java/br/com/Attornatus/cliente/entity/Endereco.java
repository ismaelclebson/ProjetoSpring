package br.com.Attornatus.cliente.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Endereco implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Column(length = 80, nullable = false)
    private String logradouro;
@Column(length = 10, nullable = false)
    private String numero;
@Column(length = 9, nullable = false)
    private String cep;
@Column(length = 50, nullable = false)
    private String cidade;
@Column(nullable = false)
    private Boolean principal;
@ManyToOne
@JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Endereco(String logradouro, String numero, String cep, String cidade, Boolean principal, Cliente cliente) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.principal = principal;
        this.cliente = cliente;
    }
}
