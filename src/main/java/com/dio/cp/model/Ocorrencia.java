package com.dio.cp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //Cria os gets
@Setter //Cria os sets
@AllArgsConstructor //Cria o contrutor com todos os argumentos
@NoArgsConstructor //Cria o construtor sem argumentos
@EqualsAndHashCode //Criar equals e hashcode
@Builder //Para acessos os dados em um DTO
@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
}
