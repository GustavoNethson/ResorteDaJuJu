package br.unipar.programacaointernet.resortunipar.service;

import br.unipar.programacaointernet.resortunipar.model.Hospede;
import br.unipar.programacaointernet.resortunipar.repository.HospedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospedeService {

    private final HospedeRepository hospedeRepository;

    public HospedeService(HospedeRepository hospedeRepository) {
        this.hospedeRepository = hospedeRepository;
    }

    public List<Hospede> getAll(){
        return hospedeRepository.findAll();
    }

    public Hospede save(Hospede hospede){
        return hospedeRepository.save(hospede);
    }

    public Optional<Hospede> getHospede(Integer nIdHospede){
        return hospedeRepository.findById(nIdHospede);
    }

    public void delete(Integer nIdHospede){
        this.hospedeRepository.deleteById(nIdHospede);
    }

}
