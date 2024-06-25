package br.unipar.programacaointernet.resortunipar.controller;

import br.unipar.programacaointernet.resortunipar.model.Hospede;
import br.unipar.programacaointernet.resortunipar.repository.HospedeRepository;
import br.unipar.programacaointernet.resortunipar.service.HospedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class HospedeController {

    private final HospedeService hospedeService;

    @Autowired
    public HospedeController(HospedeService hospedeService) {
        this.hospedeService = hospedeService;
    }

    @GetMapping(path = "/hospedes")
    public ResponseEntity<List<Hospede>> getHospedes() {
        return ResponseEntity.ok(hospedeService.getAll());
    }

    @PostMapping(path = "hospedes")
    public ResponseEntity<Hospede> addHospede(@RequestBody Hospede hospede) {
        Hospede hospedeSaved = hospedeService.save(hospede);
        return new ResponseEntity<>(hospedeSaved, HttpStatus.CREATED);
    }

}
