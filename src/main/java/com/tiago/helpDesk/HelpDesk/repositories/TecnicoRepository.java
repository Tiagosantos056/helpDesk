package com.tiago.helpDesk.HelpDesk.repositories;

import com.tiago.helpDesk.HelpDesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
