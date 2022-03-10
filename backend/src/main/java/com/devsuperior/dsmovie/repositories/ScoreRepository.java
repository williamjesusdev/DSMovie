package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.models.Score;
import com.devsuperior.dsmovie.models.ScoreID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScoreID> {
}
