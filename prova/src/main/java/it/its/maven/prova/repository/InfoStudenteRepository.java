package it.its.maven.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.its.maven.prova.entity.InfoStudente;

@Repository
public interface InfoStudenteRepository extends JpaRepository<InfoStudente, Long> {
}