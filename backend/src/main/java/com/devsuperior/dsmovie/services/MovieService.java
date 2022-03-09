package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.DTO.MovieDTO;
import com.devsuperior.dsmovie.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        return moviesRepository.findAll(pageable).map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        return moviesRepository
                .findById(id).map(MovieDTO::new)
                .orElseThrow(() -> new RuntimeException("Movie not found with ID " + id));
    }
}
