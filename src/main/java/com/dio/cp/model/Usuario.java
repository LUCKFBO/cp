package com.dio.cp.model;

import lombok.*;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //Cria os gets
@Setter //Cria os sets
@AllArgsConstructor //Cria o contrutor com todos os argumentos
@NoArgsConstructor //Cria o construtor sem argumentos
@EqualsAndHashCode //Criar equals e hashcode
@Builder //Para acessos os dados em um DTO
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne //Uma unica categoria pode ter muitos usuarios
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne //Uma unica empresa pode ter muitos usuarios
    private Empresa empresa;
    @ManyToOne //Um nivel de acesso pode ter muitos usuarios
    private NivelAcesso nivelAcesso;
    @ManyToOne //Uma jornada de trabalho pode ser feita por varios usuarios
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}
