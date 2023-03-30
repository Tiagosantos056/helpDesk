package com.tiago.helpDesk.HelpDesk.repositories;

import com.tiago.helpDesk.HelpDesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
