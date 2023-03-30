package com.tiago.helpDesk.HelpDesk.services;

import com.tiago.helpDesk.HelpDesk.domain.Chamado;
import com.tiago.helpDesk.HelpDesk.domain.Cliente;
import com.tiago.helpDesk.HelpDesk.domain.Tecnico;
import com.tiago.helpDesk.HelpDesk.domain.enums.Perfil;
import com.tiago.helpDesk.HelpDesk.domain.enums.Prioridade;
import com.tiago.helpDesk.HelpDesk.domain.enums.Status;
import com.tiago.helpDesk.HelpDesk.repositories.ChamadoRepository;
import com.tiago.helpDesk.HelpDesk.repositories.ClienteRepository;
import com.tiago.helpDesk.HelpDesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null, "Tiago Santos", "06449584300", "tiagosantos@mail.com", "123");
        tec1.addPerfil(Perfil.ADIM);

        Cliente cli1 = new Cliente(null, "Sandoval", "472.767.920-56", "sandoval@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(cha1));
    }
}
