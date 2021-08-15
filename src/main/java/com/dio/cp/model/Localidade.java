package com.dio.cp.model;

import lombok.*;

import javax.persistence.*;

@Getter //Cria os gets
@Setter //Cria os sets
@AllArgsConstructor //Cria o contrutor com todos os argumentos
@NoArgsConstructor //Cria o construtor sem argumentos
@EqualsAndHashCode //Criar equals e hashcode
@Builder //Para acessos os dados em um DTO
@Entity
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne //Um nivel de acesso por dar acesso a varias localidades
    private NivelAcesso nivelAcesso;
    private String descricao;
}
