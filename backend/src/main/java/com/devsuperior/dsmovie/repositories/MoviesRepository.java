package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movie, Long> {
}
