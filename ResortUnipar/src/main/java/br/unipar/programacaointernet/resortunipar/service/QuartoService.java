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

    public List<Quarto> getAll() {
        return this.quartoRepository.findAll();
    }

    public Quarto save(Quarto quarto) {
        return this.quartoRepository.save(quarto);
    }

    public Quarto buscaQuartoStatus(String stStatusQuarto) {
        return this.quartoRepository.findByStStatusQuarto(stStatusQuarto);
    }

    public Quarto buscaQuartoPelaCapacidade(Integer nQtdeMaxOcupantes) {
        return this.quartoRepository.findByNQtdeMaxOcupantes(nQtdeMaxOcupantes);
    }

    public Quarto buscaQuartoComVistaPaMarEDisponivel(boolean vistaMar, String stStatusQuarto) {
        return this.quartoRepository.findByVistaMarOcupado(vistaMar, stStatusQuarto);
    }

}
