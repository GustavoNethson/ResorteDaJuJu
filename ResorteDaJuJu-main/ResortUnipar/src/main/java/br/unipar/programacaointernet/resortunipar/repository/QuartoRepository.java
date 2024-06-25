package br.unipar.programacaointernet.resortunipar.repository;

import br.unipar.programacaointernet.resortunipar.model.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {
        Quarto findByStStatusQuarto(String stStatusQuarto);
        Quarto findByNQtdeMaxOcupantes(Integer nQtdeMaxOcupantes);
        Quarto findByVistaMarOcupado(boolean vistaMar, String stStatusQuarto);
}
