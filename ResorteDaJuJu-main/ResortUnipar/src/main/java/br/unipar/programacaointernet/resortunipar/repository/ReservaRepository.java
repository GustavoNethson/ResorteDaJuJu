package br.unipar.programacaointernet.resortunipar.repository;


import br.unipar.programacaointernet.resortunipar.model.Hospede;
import br.unipar.programacaointernet.resortunipar.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    //Quary para buscar o hospere pela reserva

    List<Reserva> findByHospede(Hospede hospede);
    Reserva findByNIdReserva(Integer nIdReserva);
    Reserva findByDDataEntrada(Date dDataEntrada);
    Reserva findByNIdReservaAndNIdHospede(Integer nIdReserva, Integer nIdHospede);

}

