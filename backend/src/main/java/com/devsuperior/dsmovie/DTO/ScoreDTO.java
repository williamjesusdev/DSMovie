package com.devsuperior.dsmovie.DTO;

import com.devsuperior.dsmovie.models.Score;

public class ScoreDTO {
    private Long movieID;
    private String email;
    private Double score;

    public ScoreDTO() {
    }

    public ScoreDTO(Score score) {
        this.movieID = score.getId().getMovie().getId();
        this.email = score.getId().getUser().getEmail();
        this.score = score.getValue();
    }

    public Long getMovieID() {
        return movieID;
    }

    public void setMovieID(Long movieID) {
        this.movieID = movieID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
