package com.example.Client2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Client2.entities.Voiture;

import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture,Long>{

    List<Voiture> findByClientId(Long id);
}
