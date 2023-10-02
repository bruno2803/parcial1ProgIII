package com.example.miPrimerAPIREST.services;

import com.example.miPrimerAPIREST.entities.Localidad;
import com.example.miPrimerAPIREST.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
