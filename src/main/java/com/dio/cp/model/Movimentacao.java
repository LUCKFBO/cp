package com.dio.cp.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //Cria os gets
@Setter //Cria os sets
@AllArgsConstructor //Cria o contrutor com todos os argumentos
@NoArgsConstructor //Cria o construtor sem argumentos
@EqualsAndHashCode //Criar equals e hashcode
@Builder //Para acessos os dados em um DTO
@Entity
public class Movimentacao {

    @AllArgsConstructor //Cria o contrutor com todos os argumentos
    @NoArgsConstructor //Cria o construtor sem argumentos
    @EqualsAndHashCode //Criar equals e hashcode
    @Embeddable //Para lidar com chaves primarias compostas
    public class movimentacaoId implements Serializable {
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId //Relaciona as duas chaves primarias em uma variavel
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private movimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne //Uma ocorrencia pode estar em varias movimentações
    private Ocorrencia ocorrencia;
    @ManyToOne //Um calendario pode estar em varias movimentações
    private Calendario calendario;

}
