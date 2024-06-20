package br.unipar.programacaointernet.resortunipar.controller;

import br.unipar.programacaointernet.resortunipar.model.Quarto;
import br.unipar.programacaointernet.resortunipar.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/quartos")
public class QuartoController {

    @Autowired
    private final QuartoService quartoService;

    public QuartoController(QuartoService quartoService) {
        this.quartoService = quartoService;
    }

    public ResponseEntity<List<Quarto>> getAll(){
        return ResponseEntity.ok(quartoService.getAll());
    }

    public ResponseEntity<Quarto> saveQuarto(Quarto quarto){
        return ResponseEntity.ok(quartoService.saveQuarto(quarto));
    }

    @PostMapping
    public ResponseEntity<Quarto> createQuarto(@RequestBody Quarto quarto){
    Quarto salvarQuarto =  quartoService.saveQuarto(quarto);
        return new ResponseEntity<>(salvarQuarto, HttpStatus.CREATED);
    }

}
