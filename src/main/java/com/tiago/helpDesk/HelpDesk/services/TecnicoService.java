package com.tiago.helpDesk.HelpDesk.services;


import com.tiago.helpDesk.HelpDesk.domain.Tecnico;
import com.tiago.helpDesk.HelpDesk.domain.dtos.TecnicoDTO;
import com.tiago.helpDesk.HelpDesk.repositories.TecnicoRepository;
import com.tiago.helpDesk.HelpDesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> obj = tecnicoRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ID: " + id));
    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    public Tecnico create (TecnicoDTO objDTO) {
        objDTO.setId(null);
        Tecnico newObj = new Tecnico(objDTO);
        return tecnicoRepository.save(newObj);
    }
}
