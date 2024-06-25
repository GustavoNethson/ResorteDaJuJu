package br.unipar.programacaointernet.resortunipar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Hospede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdHospede;

    private String stNomeHospede;

    private String stTelefoneHospede;

    private String stCpfHospede;

    private String stRgHospede;

    private Date dDatNascHospede;

    @ManyToOne
    private Reserva reserva;

}
