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
public class BancoHoras {

    @AllArgsConstructor //Cria o contrutor com todos os argumentos
    @NoArgsConstructor //Cria o construtor sem argumentos
    @EqualsAndHashCode //Criar equals e hashcode
    @Embeddable //Para lidar com chaves primarias compostas
    public class bancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId //Relaciona as duas chaves primarias em uma variavel
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private bancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;


}
