package com.example.miPrimerAPIREST.services;

import com.example.miPrimerAPIREST.entities.Autor;
import com.example.miPrimerAPIREST.repositories.AutorRepository;
import com.example.miPrimerAPIREST.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
