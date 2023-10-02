package com.example.miPrimerAPIREST.repositories;

import com.example.miPrimerAPIREST.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
