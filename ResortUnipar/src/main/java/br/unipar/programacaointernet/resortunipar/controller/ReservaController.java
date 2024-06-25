package br.unipar.programacaointernet.resortunipar.controller;

import br.unipar.programacaointernet.resortunipar.model.Quarto;
import br.unipar.programacaointernet.resortunipar.model.Reserva;
import br.unipar.programacaointernet.resortunipar.service.QuartoService;
import br.unipar.programacaointernet.resortunipar.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ReservaController {

    private final ReservaService reservaService;

    @Autowired
    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping(path = "/reservas")
    public ResponseEntity<List<Reserva>> getAll() {
        return ResponseEntity.ok(reservaService.getAll());
    }

    @PostMapping(path = "/reservas")
    public ResponseEntity<Reserva> createReserva(@RequestBody Reserva reserva) {
        Reserva salvarReserva = reservaService.save(reserva);
        return new ResponseEntity<>(salvarReserva, HttpStatus.CREATED);
    }
}
