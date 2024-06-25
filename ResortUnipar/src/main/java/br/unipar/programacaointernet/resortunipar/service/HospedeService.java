package br.unipar.programacaointernet.resortunipar.service;

import br.unipar.programacaointernet.resortunipar.model.Hospede;
import br.unipar.programacaointernet.resortunipar.model.Quarto;
import br.unipar.programacaointernet.resortunipar.repository.HospedeRepository;
import br.unipar.programacaointernet.resortunipar.repository.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospedeService {

    @Autowired
    private final HospedeRepository hospedeRepository;

    public HospedeService(HospedeRepository hospedeRepository) {
        this.hospedeRepository = hospedeRepository;
    }

    public List<Hospede> getAll() {
        return this.hospedeRepository.findAll();
    }

    public Hospede save(Hospede hospede) {
        return this.hospedeRepository.save(hospede);
    }

    public Hospede buscaHospedePeloID(Integer nIdHospede) {
        return this.hospedeRepository.findByNIdHospede(nIdHospede);
    }

}
