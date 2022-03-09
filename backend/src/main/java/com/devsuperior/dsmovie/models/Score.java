package com.devsuperior.dsmovie.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScoreID id;
    private Double value;

    public void setMovie(Movie movie) {
        this.id.setMovie(movie);
    }

    public void setUser(User user) {
        this.id.setUser(user);
    }

    public ScoreID getId() {
        return id;
    }

    public void setId(ScoreID id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
