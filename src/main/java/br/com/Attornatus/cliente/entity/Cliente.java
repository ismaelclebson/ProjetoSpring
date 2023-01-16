package br.com.Attornatus.cliente.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data //Criar gets e sets
@AllArgsConstructor //Criar o construtor
@NoArgsConstructor //Criar construtor vazio
@Builder //auxilia na construção do objeto cliente
@Entity //informar que é entidade no banco de dados

public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Nome", nullable = false)
    private String nome;
    @Column(name = "Data_Nascimento")
    private String dataNascimento;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> enderecos;

    public Cliente(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
