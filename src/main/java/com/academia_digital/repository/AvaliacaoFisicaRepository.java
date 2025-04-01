package com.academia_digital.repository;

import com.academia_digital.entity.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository  extends JpaRepository<AvaliacaoFisica, Long> {
}
