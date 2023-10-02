package com.example.miPrimerAPIREST.repositories;

import com.example.miPrimerAPIREST.entities.Localidad;
import com.example.miPrimerAPIREST.services.BaseService;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
