package br.unipar.programacaointernet.resortunipar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.basic.BasicIconFactory;
import java.util.Date;

@Entity
@Getter
@Setter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdReserva;

    private Date dDataEntrada;

    private Date dDataSaida;

    private String stStatus;

    private BasicIconFactory doValorTotal;

    @ManyToOne
    private Quarto quarto;

    @ManyToOne
    private Hospede hospede;

}
