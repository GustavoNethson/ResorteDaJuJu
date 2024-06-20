package br.unipar.programacaointernet.resortunipar.service;

import br.unipar.programacaointernet.resortunipar.model.Reserva;
import br.unipar.programacaointernet.resortunipar.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    //Metodo Especial
    public List<Reserva> finByHospede(){
        return this.reservaRepository.findAll();
    }

    public List<Reserva> getAll(){
        return this.reservaRepository.findAll();
    }

    public Reserva save(Reserva reserva) {
        return this.reservaRepository.save(reserva);
    }

    public Optional<Reserva> findById(Integer nIdReserva) {
        return this.reservaRepository.findById(nIdReserva);
    }

    public void delete(Reserva reserva) {
        this.reservaRepository.delete(reserva);
    }

}
