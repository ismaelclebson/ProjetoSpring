package br.com.Attornatus.cliente.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data //Criar gets e sets
@AllArgsConstructor //Criar o construtor
@NoArgsConstructor //Criar construtor vazio
@Builder //auxilia na construção do objeto cliente
@ToString
@Entity //informar que é entidade no banco de dados

public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cliente_id")
    private Long id;
    @Column(name = "Nome", nullable = false)
    private String nome;
    @Column(name = "Data_Nascimento")
    private String dataNascimento;
    @OneToMany(targetEntity = Endereco.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "fk_cliente_id", referencedColumnName = "cliente_id")
    private List<Endereco> enderecos;
}

