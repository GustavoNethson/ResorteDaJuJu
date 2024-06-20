package br.unipar.programacaointernet.resortunipar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdQuarto;

    private String stNomeQuarto;

    private Boolean boVistaMar = false;

    private BigDecimal doValorDiaQuarto;

    private Integer nQtdeMaxOcupantes;

    private String stStatusQuarto;

    @ManyToOne
    private Reserva reserva;

}
