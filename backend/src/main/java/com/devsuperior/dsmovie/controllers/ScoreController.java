package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.DTO.MovieDTO;
import com.devsuperior.dsmovie.DTO.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping
    public List<ScoreDTO> getAll() {
        return scoreService.findAll();
    }

    @PutMapping
    public MovieDTO save(@RequestBody ScoreDTO scoreDTO) {
        return scoreService.save(scoreDTO);
    }
}
