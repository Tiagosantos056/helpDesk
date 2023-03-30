package com.tiago.helpDesk.HelpDesk.repositories;

import com.tiago.helpDesk.HelpDesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
