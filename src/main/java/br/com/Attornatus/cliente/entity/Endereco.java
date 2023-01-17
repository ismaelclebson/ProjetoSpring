package br.com.Attornatus.cliente.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
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


}
