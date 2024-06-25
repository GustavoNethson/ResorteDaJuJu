package br.unipar.programacaointernet.resortunipar.controller;

import br.unipar.programacaointernet.resortunipar.model.Quarto;
import br.unipar.programacaointernet.resortunipar.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QuartoController {


    private final QuartoService quartoService;

    @Autowired
    public QuartoController(QuartoService quartoService) {
        this.quartoService = quartoService;
    }

    @GetMapping
    public ResponseEntity<List<Quarto>> getAll() {
        return ResponseEntity.ok(quartoService.getAll());
    }

    @PostMapping
    public ResponseEntity<Quarto> createQuarto(@RequestBody Quarto quarto) {
        Quarto salvarQuarto = quartoService.save(quarto);
        return new ResponseEntity<>(salvarQuarto, HttpStatus.CREATED);
    }

}



