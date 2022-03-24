package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.DTO.MovieDTO;
import com.devsuperior.dsmovie.DTO.ScoreDTO;
import com.devsuperior.dsmovie.models.Movie;
import com.devsuperior.dsmovie.models.Score;
import com.devsuperior.dsmovie.models.User;
import com.devsuperior.dsmovie.repositories.MoviesRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;
    @Autowired
    private MoviesRepository moviesRepository;
    @Autowired
    private UsersRepository usersRepository;

    @Transactional(readOnly = true)
    public List<ScoreDTO> findAll() {
        return scoreRepository.findAll().stream().map(ScoreDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public MovieDTO save(ScoreDTO scoreDTO) {
        User user = usersRepository.findByEmail(scoreDTO.getEmail()).orElse(new User());

        if(user.getId() == null) {
            user = usersRepository.save(new User(scoreDTO.getEmail()));
        }

        Movie movie = moviesRepository.findById(scoreDTO.getMovieID())
                .orElseThrow(() -> new RuntimeException("Movie not found with ID " + scoreDTO.getMovieID()));

        Score s = new Score();
        s.setMovie(movie);
        s.setUser(user);
        s.setValue(scoreDTO.getScore());

        scoreRepository.saveAndFlush(s);

        movie = moviesRepository.findById(scoreDTO.getMovieID()).get();

        Double sum = movie.getScores().stream().reduce(0.0, (partial, score) -> partial + score.getValue(), Double::sum);
        Double avg = sum / movie.getScores().size();
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        return new MovieDTO(moviesRepository.saveAndFlush(movie));
    }
}
