package br.unipar.programacaointernet.resortunipar.repository;

import br.unipar.programacaointernet.resortunipar.model.Hospede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Integer> {
    Hospede findByNIdHospede(Integer nIdHospede);

}
