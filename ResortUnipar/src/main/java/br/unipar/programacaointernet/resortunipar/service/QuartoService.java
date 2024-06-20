package br.unipar.programacaointernet.resortunipar.service;


import br.unipar.programacaointernet.resortunipar.model.Quarto;
import br.unipar.programacaointernet.resortunipar.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuartoService {

    @Autowired
    private final QuartoRepository quartoRepository;

    public QuartoService(QuartoRepository quartoRepository) {
        this.quartoRepository = quartoRepository;
    }

    public List<Quarto> getAll(){
        return quartoRepository.findAll();
    }

    public Quarto saveQuarto(Quarto quarto) {
        return quartoRepository.save(quarto);
    }

    public Optional<Quarto> findBynIdHospede(Integer nIdHospede) {
        return this.quartoRepository.findById(nIdHospede);
    }

    public void deleteBynIdHospede(Integer nIdHospede) {
        this.quartoRepository.deleteById(nIdHospede);
    }

    public List<Quarto> buscarTodosDisponiveis(){
        return this.quartoRepository.findBystStatusQuarto("Vago");
    }

    public List<Quarto> buscaQuartosPeloNome(String stNomeQuarto){
        return this.quartoRepository.findByStNomeQuarto(stNomeQuarto);
    }

    public List<Quarto> buscaQuartoPelaVistaMar(){
        return this.quartoRepository.findByBoVistaMar(true);
    }
}
