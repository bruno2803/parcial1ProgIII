package com.example.miPrimerAPIREST.services;

import com.example.miPrimerAPIREST.entities.Persona;
import com.example.miPrimerAPIREST.repositories.BaseRepository;
import com.example.miPrimerAPIREST.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
