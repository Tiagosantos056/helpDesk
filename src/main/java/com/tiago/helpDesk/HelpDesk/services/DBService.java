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

        // Carga Inicial de Técnicos
        Tecnico tec1 = new Tecnico(null, "Tiago Santos", "06449584300", "tiagosantos@mail.com", "123");
        tec1.addPerfil(Perfil.ADIM);

        Tecnico tec2 = new Tecnico(null, "Samuel Ribeiro", "06449584301", "samuelribeiro@mail.com", "123");
        tec1.addPerfil(Perfil.ADIM);

        Tecnico tec3 = new Tecnico(null, "Anna Vitória", "06449584302", "annavitoria@mail.com", "123");
        tec1.addPerfil(Perfil.ADIM);

        Tecnico tec4 = new Tecnico(null, "Domingos Pereira", "06449584303", "domingospereira@mail.com", "123");
        tec1.addPerfil(Perfil.ADIM);

        Tecnico tec5 = new Tecnico(null, "Byanca Curcino", "06449584304", "byancacurcino@mail.com", "123");
        tec1.addPerfil(Perfil.ADIM);


        // Carga inicial de Clientes
        Cliente cli1 = new Cliente(null, "Sandoval", "472.767.920-56", "sandoval@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli2 = new Cliente(null, "Jose Armando", "472.767.920-51", "josearmando@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli3 = new Cliente(null, "Felipe Dutra", "472.767.920-52", "felipedutra@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli4 = new Cliente(null, "Paulo Vieira", "472.767.920-53", "paulovieira@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli5 = new Cliente(null, "Marcus Paulo", "472.767.920-54", "marcuspaulo@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli6 = new Cliente(null, "Alex Vargas", "472.767.920-55", "alexvargas@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli7 = new Cliente(null, "Pedro Sobral", "472.767.920-57", "pedrosobra@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli8 = new Cliente(null, "Lucas Neto", "472.767.920-58", "lucasneto@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli9 = new Cliente(null, "André Pereira", "472.767.920-59", "andrepereira@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);

        Cliente cli10 = new Cliente(null, "Bruno Santos", "472.767.920-60", "brunosantos@mail.com", "123");
        cli1.addPerfil(Perfil.CLIENTE);


        // Carga inicial de Chamados
        Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Primeiro chamado", tec1, cli1);

        Chamado cha2 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 2", "Segundo chamado", tec2, cli1);

        Chamado cha3 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 3", "Terceiro chamado", tec3, cli1);

        Chamado cha4 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 4", "Quarto chamado", tec4, cli1);

        Chamado cha5 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 5", "Quinto chamado", tec5, cli1);


        // Salvando Técnicos
        tecnicoRepository.saveAll(Arrays.asList(tec1));
        tecnicoRepository.saveAll(Arrays.asList(tec2));
        tecnicoRepository.saveAll(Arrays.asList(tec3));
        tecnicoRepository.saveAll(Arrays.asList(tec4));
        tecnicoRepository.saveAll(Arrays.asList(tec5));


        // Salvando Clientes
        clienteRepository.saveAll(Arrays.asList(cli1));
        clienteRepository.saveAll(Arrays.asList(cli2));
        clienteRepository.saveAll(Arrays.asList(cli3));
        clienteRepository.saveAll(Arrays.asList(cli4));
        clienteRepository.saveAll(Arrays.asList(cli5));
        clienteRepository.saveAll(Arrays.asList(cli6));
        clienteRepository.saveAll(Arrays.asList(cli7));
        clienteRepository.saveAll(Arrays.asList(cli8));
        clienteRepository.saveAll(Arrays.asList(cli9));
        clienteRepository.saveAll(Arrays.asList(cli10));


        // Salvando Chamados
        chamadoRepository.saveAll(Arrays.asList(cha1));
        chamadoRepository.saveAll(Arrays.asList(cha2));
        chamadoRepository.saveAll(Arrays.asList(cha3));
        chamadoRepository.saveAll(Arrays.asList(cha4));
        chamadoRepository.saveAll(Arrays.asList(cha5));
    }
}
