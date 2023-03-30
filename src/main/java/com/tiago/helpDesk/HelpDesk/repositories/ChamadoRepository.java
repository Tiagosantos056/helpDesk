package com.tiago.helpDesk.HelpDesk.repositories;

import com.tiago.helpDesk.HelpDesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
